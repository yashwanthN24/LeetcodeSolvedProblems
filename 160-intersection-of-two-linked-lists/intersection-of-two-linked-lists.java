/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // while(headA != null){
        //     ListNode temp = headB;
        //     while(temp != null){
        //         if(temp == headA){
        //             return temp ;
        //         }
        //         temp = temp.next ; 
        //     }
        //     headA = headA.next ; 
        // }
        // return null ; 
        // }

        // ListNode temp1 = headA;
        // ListNode temp2 = headB;

        // while(temp1 != temp2){
        //     temp1 = (temp1 == null) ? headB : temp1.next;
        //     temp2 = (temp2 == null) ? headA : temp2.next;
        // }

        // return temp1;


        HashSet<ListNode> hs = new HashSet<>();

        ListNode temp1 = headA;

        while(temp1!=null){
            hs.add(temp1);
            temp1 = temp1.next;
        }

        ListNode temp2 = headB;
        while(temp2!=null){
            if(hs.contains(temp2)){
                return temp2;
            }
            temp2 = temp2.next;
        }

        return null;
}
}