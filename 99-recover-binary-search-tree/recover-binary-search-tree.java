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

    // public void recoverTree(TreeNode root) {
    //     ArrayList<Integer> inorderseq = new ArrayList<>();
    //     getInorder(root , inorderseq);

    //     // correct inorder seqence 
    //     Collections.sort(inorderseq);

    //     traverseInorder(root , inorderseq);

    // }

    // public void getInorder(TreeNode root , ArrayList<Integer> list){
        
    //     if(root == null){
    //         return ;
    //     }

    //     getInorder(root.left , list);
    //     list.add(root.val);
    //     getInorder(root.right , list);

    // }

    // int i = 0;
    // public void traverseInorder(TreeNode root , ArrayList<Integer> correctseq){
    //     if(root == null){
    //         return ; 
    //     }

    //     traverseInorder(root.left , correctseq);
    //     if(root.val != correctseq.get(i)){
    //         int temp = root.val; 
    //         root.val = correctseq.get(i);
    //         correctseq.set(i  , temp );
            
    //     }
    //     i++;
    //     traverseInorder(root.right , correctseq);
    // }



    // Approach 2 - O(n) only inorder traversal
    TreeNode first ,prev ,  middle , last ; 
    public void recoverTree(TreeNode root) {
        first = middle = last = null;
        prev = new TreeNode(Integer.MIN_VALUE);
        inorder(root);

        if(first!=null && last != null){
            int temp = first.val ; 
            first.val = last.val ; 
            last.val = temp ; 
        }else if(first != null && middle != null){
            int temp = middle.val ; 
            middle.val = first.val ; 
            first.val = temp ; 
        }

    }

    public void inorder(TreeNode root){
        if(root == null){
            return ;
        }

        inorder(root.left);

        if(prev != null && (root.val < prev.val )){

            if(first == null){
                first = prev ; 
                middle = root; 
            }else{
                last = root ; 
            }

        }

        prev = root ; 
        inorder(root.right);
    }




}