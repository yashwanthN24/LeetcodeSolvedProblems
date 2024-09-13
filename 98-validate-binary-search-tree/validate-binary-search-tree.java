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

    // Approach 1 

    // public void inorderseq(TreeNode root , ArrayList<Integer> seq){
        
    //     if(root == null)
    //         return ; 

    //     inorderseq(root.left, seq);
    //     seq.add(root.val);
    //     inorderseq(root.right , seq);
    // }

    // public boolean isValidBST(TreeNode root) {
    //     ArrayList<Integer> inorder = new ArrayList<>() ; 
    //     inorderseq(root  , inorder);

    //     for(int i = 0 ; i<inorder.size()-1; i++){
    //         if(inorder.get(i) >= inorder.get(i+1)){
    //             return false ; 
    //         }
    //     }


    //     return true ; 
    // }


    // Approach  2


    public boolean isValidBST(TreeNode root) {
        return ValidateBst(root , null , null);
    }

    public boolean ValidateBst(TreeNode root , TreeNode min , TreeNode max){
        if(root == null){
            return true ; 
        }

        if(min != null && root.val <= min.val){
            return false ; 
        }

        if(max != null && root.val >= max.val){
            return false ; 
        }

        return ValidateBst(root.left , min , root) && ValidateBst(root.right , root , max);
    
    }
}