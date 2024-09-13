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
    public TreeNode increasingBST(TreeNode root) {
        return Helper(root);
    }

    public TreeNode Helper(TreeNode root){
        if(root == null){
            return null;
        }

        ArrayList<Integer> al = new ArrayList<>();
        getInorder(root , al);

        TreeNode newRoot = null ; 

        for(int i = 0 ; i<al.size(); i++){
            newRoot = insert(newRoot , al.get(i));
        }
        return newRoot ; 
    }

    public TreeNode insert(TreeNode root , int val){
        if(root == null){
            root = new TreeNode(val);
            return root ; 
        }

        if(val > root.val){
            root.right = insert(root.right , val);
        }else{
            root.left = insert(root.left , val);
        }

        return root ; 
    }

    public void getInorder(TreeNode root , ArrayList<Integer> list){
        if(root == null){
            return ;
        }

        getInorder(root.left , list);
        list.add(root.val);
        getInorder(root.right , list);
    }

}