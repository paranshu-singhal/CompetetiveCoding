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
    
    int longest = 0;
    
    public int longestUnivaluePath(TreeNode root) {
        
        recurse(root);
        return longest;
    }
    
    int recurse(TreeNode root) {
        
        if(root==null) return 0;
        
        int left = recurse(root.left);
        int right = recurse(root.right);
        
        if(root.left!=null && root.right!=null && root.val == root.left.val && root.val == root.right.val) {
            longest = Math.max(longest, left+right+2);
            return Math.max(left, right)+1;
        } else if(root.left!=null && root.val == root.left.val) {
            longest = Math.max(longest, left+1);
            return left+1;
        } else if (root.right!=null && root.val == root.right.val) {
            longest = Math.max(longest, right+1);
            return right+1;
        } 
        
        return 0;
        
    }
}