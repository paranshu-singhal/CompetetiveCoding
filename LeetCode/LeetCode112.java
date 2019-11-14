/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        
        return helper(root,0,sum);
    }
    
    boolean helper(TreeNode root, int sum, int target){
        
        if(root==null) return false;
        
        sum += root.val;
        if(root.left==null && root.right==null && sum==target) return true;
        
        if(helper(root.left, sum, target)) return true;
        return helper(root.right, sum, target);
        
    }
}