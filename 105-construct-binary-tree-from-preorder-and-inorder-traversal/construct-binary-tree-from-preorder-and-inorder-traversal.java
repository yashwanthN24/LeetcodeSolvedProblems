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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildSubtree(inorder, 0, inorder.length - 1, preorder, 0, preorder.length - 1, map);
    }

    private TreeNode buildSubtree(int[] inorder, int inStart, int inEnd, int[] preorder, int preStart, int preEnd, HashMap<Integer, Integer> map) {
        if (inStart > inEnd || preStart > preEnd) {
            return null;
        }

        // Root is always the first element in preorder array
        TreeNode root = new TreeNode(preorder[preStart]);

        // Find the index of the root in the inorder array
        int inRootIndex = map.get(root.val);
        int leftTreeSize = inRootIndex - inStart;

        // Recursively build the left subtree
        root.left = buildSubtree(inorder, inStart, inRootIndex - 1, preorder, preStart + 1, preStart + leftTreeSize, map);

        // Recursively build the right subtree
        root.right = buildSubtree(inorder, inRootIndex + 1, inEnd, preorder, preStart + leftTreeSize + 1, preEnd, map);

        return root;
    }
}