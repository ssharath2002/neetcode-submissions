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
           if(root == null){
              return true;
           }
           return function(root);
    }
    public boolean function(TreeNode node){
            if(node == null){
                return true;
            }
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);
            if(Math.abs(rightHeight - leftHeight)>1){
                return false;
            }
            return function(node.left) && function(node.right);
    }
    private int height(TreeNode node){
          if(node==null){
            return 0;
          }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }
}

