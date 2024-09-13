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
    List<Integer> al = new ArrayList<>();

    public void getInorder(TreeNode root , List<Integer> list){
        if(root == null){
            return ; 
        }

        getInorder(root.left , list);
        list.add(root.val);
        getInorder(root.right , list);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        getInorder(root1 , list1);
        getInorder(root2 , list2);

        List<Integer> merged = new ArrayList<>();

        int i = 0 , j = 0;
        while(i < list1.size() && j < list2.size()){
            if(list1.get(i) <= list2.get(j)){
                merged.add(list1.get(i++));
            }else{
                merged.add(list2.get(j++));
            }
        }

        while(i < list1.size()){
            merged.add(list1.get(i++));
        }

        while(j < list2.size()){
            merged.add(list2.get(j++));
        }

        return merged ;
    }
}