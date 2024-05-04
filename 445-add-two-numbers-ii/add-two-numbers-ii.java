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

    public ListNode  insertAtTail(ListNode head , int value){
        ListNode newNode = new ListNode(value);
        if(head == null){ 
            return  newNode ; 
        }

        ListNode temp = head ;
        while(temp.next != null){
            temp = temp.next ; 
        }
        temp.next = newNode ; 
        return head ;
        
    }

    public ListNode reverse(ListNode head){
        ListNode cur = head ; 
        ListNode prev = null ; 
        ListNode next ; 

        while(cur != null){
            next = cur.next ; 
            cur.next = prev ; 
            prev = cur ; 
            cur = next ; 
        }

        return prev ; 
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // reverse both l1 and l2 
        ListNode newl1 = reverse(l1);
        ListNode newl2 = reverse(l2);

        ListNode ans = null ; 
        int carry = 0 ;
        while(newl1 != null && newl2 != null ){
            int sum = newl1.val + newl2.val + carry ; 

            int digit = sum % 10 ; 

            ans = insertAtTail(ans , digit);

            carry = sum / 10 ; 
            newl1 = newl1.next ; 
            newl2 = newl2.next ;
            
        }

        while(newl2 != null){
            int sum = carry + newl2.val ; 

            int digit = sum % 10 ; 

            ans = insertAtTail(ans , digit);

            carry = sum / 10 ; 

            newl2 = newl2.next ; 
        }

        while(newl1 != null){
            int sum = carry + newl1.val ; 

            int digit = sum % 10 ; 

            ans = insertAtTail(ans , digit);

            carry = sum / 10 ; 

            newl1 = newl1.next ; 
        }


        if(carry != 0){
            ans =  insertAtTail(ans , carry);
        }

        return reverse(ans) ;

    }
}