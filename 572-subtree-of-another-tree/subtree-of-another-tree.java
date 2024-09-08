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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null || subRoot == null){
            return false; 
        }

        if(root.val == subRoot.val){
            if(isIdentical(root , subRoot)){
                return true;
            }
        }

        return isSubtree(root.left , subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean isIdentical(TreeNode node , TreeNode subroot){
        
        if(node == null && subroot == null){
            return true ;
        }

        if(node == null || subroot == null || node.val != subroot.val){
            return false;
        }

        if(!isIdentical(node.left , subroot.left)){
            return false ; 
        }

        if(!isIdentical(node.right , subroot.right)){
            return false ; 
        }

        return true ;
    }
}