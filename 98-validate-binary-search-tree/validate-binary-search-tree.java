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

    public void inorderseq(TreeNode root , ArrayList<Integer> seq){
        
        if(root == null)
            return ; 

        inorderseq(root.left, seq);
        seq.add(root.val);
        inorderseq(root.right , seq);
    }

    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> inorder = new ArrayList<>() ; 
        inorderseq(root  , inorder);

        for(int i = 0 ; i<inorder.size()-1; i++){
            if(inorder.get(i) >= inorder.get(i+1)){
                return false ; 
            }
        }


        return true ; 
    }
}