/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q){
            return root ;
        }

        TreeNode leftlca = lowestCommonAncestor(root.left,p,q);
        TreeNode rightlca = lowestCommonAncestor(root.right,p,q);

        if(rightlca == null){
            return leftlca ; 
        }else if(leftlca == null){
            return rightlca;
        }

        // if both leftlca and rightlca not null return  the root that s the lca 
        return root;
    }
}