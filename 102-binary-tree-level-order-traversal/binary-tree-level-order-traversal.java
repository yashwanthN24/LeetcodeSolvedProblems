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
    List<List<Integer>> allnodes = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }

        Queue<TreeNode> q = new LinkedList<>();
        
        List<Integer> curlevelnodes = new ArrayList<>();


        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode curr = q.remove();

            if(curr == null){
                allnodes.add(curlevelnodes);
                if(q.isEmpty()){

                    break ;
                }
                q.add(null);
                curlevelnodes = new ArrayList<>();
                
                
            }else{
                curlevelnodes.add(curr.val);


                // get neighbours

                if(curr.left != null){
                    q.add(curr.left);
                }


                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }

        return allnodes;
    }
}