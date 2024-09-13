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

    // Approach 1 : Brute Force Time Complexity : O(2n) + O(nlogn) => O(nlogn)
    // Space complexity : O(n) due to extra arrayList creation , Apart from auxillary  recursion Stack space

    public void recoverTree(TreeNode root) {
        ArrayList<Integer> inorderseq = new ArrayList<>();
        getInorder(root , inorderseq);

        // correct inorder seqence 
        Collections.sort(inorderseq);

        traverseInorder(root , inorderseq);

    }

    public void getInorder(TreeNode root , ArrayList<Integer> list){
        
        if(root == null){
            return ;
        }

        getInorder(root.left , list);
        list.add(root.val);
        getInorder(root.right , list);

    }

    int i = 0;
    public void traverseInorder(TreeNode root , ArrayList<Integer> correctseq){
        if(root == null){
            return ; 
        }

        traverseInorder(root.left , correctseq);
        if(root.val != correctseq.get(i)){
            int temp = root.val; 
            root.val = correctseq.get(i);
            correctseq.set(i  , temp );
            
        }
        i++;
        traverseInorder(root.right , correctseq);
    }

}