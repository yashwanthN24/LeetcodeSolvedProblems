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


    public ListNode insertAtHead(ListNode head  , int value ){
        ListNode newNode = new ListNode(value);
        if(head == null){
            return newNode ;
        }

        newNode.next = head ; 
        return newNode ; 
    }
    public ListNode reversed(ListNode head){
        ListNode prev = null ; 
        ListNode cur = head ; 
        ListNode next ; 

        while(cur != null){
            next = cur.next ; 
            cur.next = prev ; 
            prev = cur ; 
            cur = next ; 
        }

        return prev ;
    }

    public ListNode doubleIt(ListNode head) {
        ListNode reversehead = reversed(head);

        ListNode doubledList  = null ;  
        int carry = 0 ; 
        while(reversehead != null ){
            int curproduct =  reversehead.val * 2 + carry ; 

            int digit = curproduct % 10 ; 

            
            doubledList = insertAtHead(doubledList , digit);
            

            carry = curproduct / 10 ; 

            reversehead = reversehead.next ;

        }

        if(carry != 0){
            doubledList = insertAtHead(doubledList , carry);
        }

        return doubledList ; 
    }
}