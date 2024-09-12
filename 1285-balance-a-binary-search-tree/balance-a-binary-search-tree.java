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
    public TreeNode balanceBST(TreeNode root) {
        if(root == null){
            return null;
        }

        ArrayList<Integer> al = new ArrayList<>();
        getInorder(root , al);

        return sortedListToBalancedBst(al , 0 , al.size()-1);
    }

    public void getInorder(TreeNode root , ArrayList<Integer> al){
        if(root == null){
            return ;
        }

        getInorder(root.left , al);
        al.add(root.val);
        getInorder(root.right , al);
    }

    public TreeNode sortedListToBalancedBst(ArrayList<Integer> al , int st , int end){
        if(st > end){
            return null ; 
        }


        int mid = st + (end - st)/2 ; 
        TreeNode root = new TreeNode(al.get(mid));
        root.left = sortedListToBalancedBst(al , st , mid -1 );
        root.right = sortedListToBalancedBst(al , mid + 1 , end );

        return root ;
    }
}