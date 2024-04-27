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
    public boolean isPalindrome(ListNode head) {
            // find midNode using slow fast pointer approach 

            if(head == null){
                return false; 
            }

            ListNode slow = head ; 
            ListNode fast = head ; 
            while(fast!=null && fast.next!=null){
                slow = slow.next ; 
                fast = fast.next.next ; 
            }
             ListNode midNode = slow ; 

            //  reverse the 2nd half starting from midNode 
            ListNode cur = midNode ; 
            ListNode prev = null ; 
            ListNode next ; 


            while(cur != null ){
                next = cur.next ; 
                cur.next = prev ; 
                prev = cur ; 
                cur = next ; 
            }

            ListNode reversedhalfhead = prev ; 


            // now comparing elements 
            ListNode left = head ; 
            ListNode right = reversedhalfhead ; 

            while(right!=null){
                if(left.val != right.val){
                    return false ; 
                }
                left = left.next ; 
                right = right.next ; 
            }


            return true ; 
    }
}