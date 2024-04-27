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
    public ListNode middleNode(ListNode head) {
        // slow fast pointer approach 

        // we increment slow with one node and fast as 2 nodes increment 

        ListNode slow = head ; 
        ListNode fast = head ; 

        // the condition handles both even and oddlength linkedlist 
        while(fast != null && fast.next !=null){
            slow = slow.next ; // slow -> + 1 
            fast = fast.next.next ;  // fast -> +2 
        }
        // onces fast reaches end , slow will point to the middle node 
        return slow ; 
    }
}