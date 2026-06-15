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
    private int maxSum;
    public int maxPathSum(TreeNode root) {
        maxSum=Integer.MIN_VALUE;
        function(root);
        return maxSum;
    }
    public int function(TreeNode node){
        if(node==null) return 0;
       
        int leftSum = Math.max(0,function(node.left));
        int rightSum= Math.max(0,function(node.right));
        int currentSum = node.val+leftSum+rightSum;
        maxSum=Math.max(maxSum, currentSum);
        return  node.val+Math.max(leftSum , rightSum);
    }
}
