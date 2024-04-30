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

    public ListNode reverseLL(ListNode head){
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // 
        if(head == null || head.next == null || left > right  || left == right  ){
            return head ; 
        }
        
        int size = 0 ; 
        ListNode tempo = head ; 
        while(tempo != null){
            size++ ; 
            tempo = tempo.next ;
        }

        if(left == 1 && right == size ){
            return reverseLL(head);
        }


       

        ListNode leftNode ; 
        ListNode RightNode;
        ListNode temp = head ; 
        int i = 1 ; int j =1 ;
        while (i < left ){
            temp = temp.next ;
            i++;
        }
        
        leftNode = temp;
        temp = head ; 
        while(j < right ){
            temp = temp.next; 
            j++;
        }

        RightNode = temp ; 

        temp = null ; 

        // if(left == 1 ){
        //     temp = head ; 
        //     while(temp != null ){

        //     }
        // }


        

        // if(leftNode == head && RightNode == head.next && head.next.next == null ){
        //     leftNode.next = null ; 
        //     RightNode.next = leftNode ; 
        //     return RightNode ; 
        // }

        ListNode prev = null ; 
        ListNode cur = leftNode ; 
        ListNode next = null  ; 


        // temp = head ; 
        // while(temp.next != null){
        //     temp = temp.next ;
        // }
        // ListNode Tail = temp ; 
        
        while(cur  != null){
            next = cur.next ;
            if(next == RightNode.next){
                cur.next = prev ; 
                cur = null ;
                continue ; 
            } 
            cur.next = prev ; 
            prev = cur ;
            cur = next ;
        }
        ListNode MainHead = head ; 
        if(left != 1 ){
            
            while(head.next.next != null){
                head = head.next; 

            }
            head.next = RightNode; 
        }
        leftNode.next = next  ; 

        if(left != 1)
        return MainHead  ;
        else
        return RightNode ;  




    }
}