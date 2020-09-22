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
    public int deepestLeavesSum(TreeNode root) {
        int deepest = finaMaxDepth(root,0);
        // System.out.println(deepest);
        return findSum(root, 1, deepest);
    }
    
    public int finaMaxDepth(TreeNode root, int level) {
        if(root==null) return 0;
        
        int left = finaMaxDepth(root.left, level+1);
        int right = finaMaxDepth(root.right, level+1);
        
        return Math.max(left, right)+1;
        
    }
    
    public int findSum(TreeNode root, int level, int deepest) {
        if(root == null) return 0;
        if(level == deepest) return root.val;
        
        return findSum(root.left, level+1, deepest) + findSum(root.right, level+1, deepest);
    }
}