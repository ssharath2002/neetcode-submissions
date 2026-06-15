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
    private int maxDepth=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        calcDepth(root);
        return maxDepth;
    }

    private int calcDepth(TreeNode node){

        if(node==null){
            return 0;
        }
        int leftDep=calcDepth(node.left);
        int rightDep=calcDepth(node.right);

        int currDep=leftDep+rightDep;

        maxDepth=Math.max(maxDepth, currDep);
        return 1+Math.max(leftDep, rightDep);
    }
}
