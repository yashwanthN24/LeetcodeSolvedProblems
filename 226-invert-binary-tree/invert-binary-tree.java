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
    public TreeNode invertTree(TreeNode root) {
        
        if(root == null){
            return null;
        }
        TreeNode leftRoot = invertTree(root.left);
        TreeNode rightRoot = invertTree(root.right);

        root.right = leftRoot ; 
        root.left = rightRoot ; 
        return root ; 
    }
}