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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        

        // first find the size of the linkedlist 
        int size = 0 ; 
        ListNode temp = head ; 
        while(temp != null){
            temp = temp.next;
            size++;
        }


        // empty likedlist and node number greater than linkedlist size case 
        if(head == null || n > size ){
            return head ;
        }


        // deletefront case 
        if(n == size ){ 
            head = head.next ; 
            return head ; 
        }

        int i = 1 ; // i tracks the node number 
        ListNode prev = head ; 
        while(i < size - n){
            prev = prev.next ; 
            i++;
        }

        // i == size-n so we reached the previous node 
        // make it next to next to nextnodes next 

        prev.next = prev.next.next ; 

        return head;

    }
}