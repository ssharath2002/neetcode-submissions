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
        private int max_sum=Integer.MIN_VALUE;
        public int maxPathSum(TreeNode root){
            function(root);
            return max_sum;
        }

    public int function(TreeNode node){
        if(node==null) return 0;
        int left_sum=Math.max(0, function(node.left));
        int right_sum=Math.max(0, function(node.right));
        int current_sum= node.val+left_sum+right_sum;
        max_sum=Math.max(max_sum, current_sum);
        return node.val+Math.max(left_sum , right_sum);
    }
}
    

