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
    
        // Method to merge two binary trees
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        // Base case 1: If both trees are null, return null because there is nothing to merge
        if (root1 == null && root2 == null) {
            return null;
        }

        // Base case 2: If root1 is null, return root2. This means there is no node in root1 at this position,
        // so we just take the node from root2.
        if (root1 == null) {
            return root2;
        }

        // Base case 3: If root2 is null, return root1. This means there is no node in root2 at this position,
        // so we just take the node from root1.
        if (root2 == null) {
            return root1;
        }

        // Create a new node called sumroot. This node will store the sum of root1's and root2's values
        TreeNode sumroot = new TreeNode(root1.val + root2.val);

        // Recursively merge the left children of root1 and root2, and assign the merged tree to sumroot's left child
        sumroot.left = mergeTrees(root1.left, root2.left);

        // Recursively merge the right children of root1 and root2, and assign the merged tree to sumroot's right child
        sumroot.right = mergeTrees(root1.right, root2.right);

        // Return the root of the merged tree (sumroot)
        return sumroot;
    }
}