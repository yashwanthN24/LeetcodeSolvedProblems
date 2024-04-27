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
    public ListNode deleteMiddle(ListNode head) {
        
        
        if(head == null || head.next == null ){
            return null ; 
        }
        
        // finding size 


        int size = 0 ; 
        ListNode temp = head ; 
        while(temp != null){
            temp = temp.next;
            size++;
        }

        // find middle node using slow fast pointer approach 
        ListNode slow = head ; 
        ListNode fast = head ; 
        ListNode prev = null ; 
        while(fast != null && fast.next !=null){
            prev = slow; 
            slow = slow.next ; 
            fast = fast.next.next ; 
        }
        prev.next = prev.next.next  ; 
        return head ; 
    }
}