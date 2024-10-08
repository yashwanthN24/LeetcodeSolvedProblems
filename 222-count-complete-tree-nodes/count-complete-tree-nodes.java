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
    int count = 0 ;
    public int countNodes(TreeNode root) {
        countnodes(root);
        return count ;

    }
    // any traversal works be it inorder , preorder , postorder , but i used inorder here 
    public void countnodes(TreeNode root){
        if(root == null){
            return ;
        }
        count++;
        countnodes(root.left);
        countnodes(root.right);
    }
}