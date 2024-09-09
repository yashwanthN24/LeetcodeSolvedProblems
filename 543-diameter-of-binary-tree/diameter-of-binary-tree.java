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
    static class Info{
        int diameter;
        int height ;
        
        Info(int di , int ht){
            this.diameter = di;
            this.height = ht;
        }
    }
    public int diameterOfBinaryTree(TreeNode root) {
        

         return diameter(root).diameter - 1;
    }

    public Info diameter(TreeNode root){
        if(root == null){
            return new Info(0 , 0);
        }


        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int finalDiameter = Math.max(Math.max(leftInfo.diameter  , rightInfo.diameter) , leftInfo.height + rightInfo.height + 1);

        int finalHeight = Math.max(leftInfo.height , rightInfo.height) + 1 ;

        return new Info(finalDiameter , finalHeight);
    }
}