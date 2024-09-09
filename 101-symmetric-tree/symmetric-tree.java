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
    public TreeNode invertSubTree(TreeNode root){
        if(root == null){
            return null;
        }

        TreeNode leftroot = invertSubTree(root.left);
        TreeNode rightroot = invertSubTree(root.right);

        root.left = rightroot ; 
        root.right = leftroot ; 
        return root ; 
    }
    public boolean isSymmetric(TreeNode root) {
        if(root.left == null && root.right == null){
            return true;
        }
        TreeNode rightInvert = invertSubTree(root.right);

        if(root == null || rightInvert == null){
            return false ; 
        }

        if(isIdentical(root.left , rightInvert)){
            return true ;
        }

        return false ; 
    }

    public boolean isIdentical(TreeNode node , TreeNode root){
        if(node == null && root == null){
            return true;
        }

        if(node == null || root == null || node.val != root.val){
            return false ; 
        }

        if(!isIdentical(node.left , root.left)){
            return false ; 
        }

        if(!isIdentical(node.right , root.right)){
            return false ; 
        }

        return true ;
    }
}
