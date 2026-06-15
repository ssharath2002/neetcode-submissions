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
    public int goodNodes(TreeNode root) {
        return countgoodNodes(root, Integer.MIN_VALUE);
    }
    public int countgoodNodes(TreeNode node, int MaxSoFar){
        if(node==null){ 
            return 0;
        }
        int count=0;
        if(node.val>=MaxSoFar){
            count=1;
            MaxSoFar=node.val;
        }
        count+=countgoodNodes(node.left, MaxSoFar);
        count+=countgoodNodes(node.right, MaxSoFar);
        return count;
    }
    
}


