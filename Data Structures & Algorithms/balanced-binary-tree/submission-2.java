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
    public boolean isBalanced(TreeNode root) {
          if(root==null){
              return true;
          }
          return isBalancedHelper(root);
    }
 
    public boolean isBalancedHelper(TreeNode node){
          if(node==null){
               return true;
          }
          int leftHeight= height(node.left);
          int rightHeight=height(node.right);
          if(Math.abs(leftHeight-rightHeight)>1){
                  return false;
          }
          return isBalancedHelper(node.left) && isBalancedHelper(node.right);
    }
    private int height(TreeNode node){
         if(node==null){
            return 0;
         }
         return 1+ Math.max(height(node.left), height(node.right));
    }
}

