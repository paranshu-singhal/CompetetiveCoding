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
    public int kthSmallest(TreeNode root, int k) {
        
        return helper(root, k);
        
    }
    Integer left = 0;
    
    int helper(TreeNode root, int k){
        
        if(root==null) return Integer.MIN_VALUE;
        
        int l = helper(root.left, k);
        
        if(l!= Integer.MIN_VALUE) return l;
        
        left++;
        
        if(left == k){
            return root.val;
        }
        
        return helper(root.right, k);
    }
}