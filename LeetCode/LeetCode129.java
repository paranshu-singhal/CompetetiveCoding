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
    public int sumNumbers(TreeNode root) {
        
        if(root==null) return 0;
        
        List<Integer> sum = new ArrayList<Integer>();
        sum.add(0);
        
        helper(root, 0, sum);
        return sum.get(0);
    }
    
    void helper(TreeNode root, int current, List<Integer> sum){
        
        if(root==null) return;
        
        current = current*10 + root.val;
        
        if(root.left == null && root.right==null) {
            sum.add(0, sum.get(0) + current);
            return;
        }
        
        helper(root.left, current, sum);
        helper(root.right, current, sum);
    }
}