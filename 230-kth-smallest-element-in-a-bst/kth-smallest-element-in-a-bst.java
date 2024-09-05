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

    int ans  ;
    int count ;

    public int kthSmallest(TreeNode root, int k) {
        inOrderTraversal(root, k);
        return ans;
    }

    public void inOrderTraversal(TreeNode root, int k) {
        if (root == null) {
            return;
        }

        // Traverse the left subtree.
        inOrderTraversal(root.left, k);

        // Process the current node.
        count++;
        if (count == k) {
            ans = root.val;
            return; // Stop traversal once we find the kth element.
        }

        // Traverse the right subtree.
        inOrderTraversal(root.right, k);
    }
}