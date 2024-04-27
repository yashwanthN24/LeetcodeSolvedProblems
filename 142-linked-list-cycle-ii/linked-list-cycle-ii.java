/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {


        
      
        ListNode slow = head ; 
        ListNode fast = head ; 
        boolean hascycle = false ; 
        while(fast!=null && fast.next != null){
            slow = slow.next; 
            fast = fast.next.next;
            if(slow == fast)
            {
                hascycle = true ; 
                break ; 
            }
        }
        if(!hascycle )
            return null;

    
        if(fast == head){
            return fast ; 
        }
        

        slow = head ; 
        ListNode prev = null ; 
        while(slow != fast ){
            slow = slow.next ; 
            prev = fast ; 
            fast = fast.next ; 
        }

        return prev.next ; 
        

    }
}