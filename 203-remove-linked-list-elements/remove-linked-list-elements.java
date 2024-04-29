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
    public ListNode removeElements(ListNode head, int val) {
        // ListNode dummy = new ListNode(-1, head);
        // ListNode pre = dummy;
        // while (pre.next != null) {
        //     if (pre.next.val != val)
        //         pre = pre.next;
        //     else
        //         pre.next = pre.next.next;
        // }
        // return dummy.next; 
        

        ListNode dummy = new ListNode(-1); 
        dummy.next = head ; 
        ListNode prev = dummy ; 
        ListNode cur = head ; 

        
        while(cur != null ){
            if(cur.val == val ){
                prev.next = cur.next ; 
            }else{
                prev = cur ; 
            }
            cur = cur.next ; 
        }

        return dummy.next ; 
    }
}