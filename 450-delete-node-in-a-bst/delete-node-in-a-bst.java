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

    public TreeNode deleteNode(TreeNode root, int key) {
        // if root == null no tree so nothing to delete 
        if(root == null){
            return null;
        }

        // search for the key if tree exists 
        if(key < root.val){
            // delete that node that in leftsubtree and return the updated left subtree after deletion 
            root.left = deleteNode(root.left , key);
        }else if(key > root.val){
            // search in rightsubtree and if found delete that node and return the updated rightsubtree  node ;
            root.right = deleteNode(root.right , key);
        }else{
            // root == key 
            // peform deletion

            // leafnode case 
            if(root.left == null && root.right == null){
                return null; // that node is garbage collected as its not being references by any variable now as we are returning null to root.right or left in parent call

            }

            // one child case 
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }


            // Two  Children Case 

            // get Inorder successor (IS) of node

            // Inorder successor of a node is leftmost node( having no left child),
            //  in the right subtree so we pass the nodes rootsubtree
            TreeNode IS = getInorderSuccessor(root.right);


            // replace node to be deleted value with IS value 
            root.val = IS.val ; 

            // delete the IS node
            root.right = deleteNode(root.right , IS.val); 


            return root;

        }
        return root;
    }


    public TreeNode getInorderSuccessor(TreeNode rightSubtreeNode){


        while(rightSubtreeNode.left != null){
            rightSubtreeNode = rightSubtreeNode.left ; 
        }


        return rightSubtreeNode ; 
    }
}