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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();
         helper(root, list);
         return list;
    }
    
    void helper(TreeNode root, List<Integer> list){
        if(root==null) return;
        
        helper(root.left, list);
        
        list.add(root.val);
        
        helper(root.right, list);
    }
}