/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    

    public ListNode getMid(ListNode head){
        ListNode slow = head ; 
        ListNode fast = head.next ; 
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next ; 
        }
        return slow;
    }

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head ; 
        }

        // getMid Node 
        ListNode midNode = getMid(head);

        ListNode rightHead = midNode.next ; 

        midNode.next = null ;

        ListNode newleft = sortList(head);
        ListNode newright = sortList(rightHead);

        return merge(newleft , newright);
    }

    public ListNode merge(ListNode left , ListNode right ){
        ListNode mergedLL = new ListNode(-1);
        ListNode temp = mergedLL ; 

        while(left != null && right != null){
            if(left.val < right.val ){
                temp.next = left ; 
                left = left.next ; 
                temp = temp.next ; 
            }else{
                temp.next = right ;
                right = right.next ; 
                temp = temp.next ; 
            }
        }

        if(left != null ){
            temp.next = left ; 
            left = left.next ; 
            temp = temp.next ;
        }

        if(right != null){
            temp.next = right ;
            right = right.next ; 
            temp = temp.next ; 
        }

        return mergedLL.next ; 
    }
}