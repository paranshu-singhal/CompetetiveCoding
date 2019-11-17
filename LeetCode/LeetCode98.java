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
    public boolean isValidBST(TreeNode root) {
        
        //return helper(root, null);
        return helper(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    }
    
    boolean helper(TreeNode root, double min, double max){
            
        if(root == null) return true;
        
        if(root.val <=min || root.val >=max){
            return false;
            
        }
        
        boolean left = helper(root.left , min, root.val);
        boolean right = helper(root.right, root.val, max);
        
        if(!left || !right){
            return false;
        }
        
        return true;
    }
}