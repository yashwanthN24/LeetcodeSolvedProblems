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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> al = new ArrayList<>();
        while(head !=null){
            al.add(head.val);
            head = head.next ; 
        }

        return sortedListToBalancedBst(al , 0 , al.size()-1);
    }

    public TreeNode sortedListToBalancedBst(ArrayList<Integer> al , int st , int end){
        if(st > end){
            return null ; 
        }

        int mid = st + ( end - st) /2 ; 
        TreeNode root = new TreeNode(al.get(mid));
        root.left = sortedListToBalancedBst(al ,st ,mid -1);
        root.right = sortedListToBalancedBst(al , mid + 1  ,end);


        return root ; 
    }
}