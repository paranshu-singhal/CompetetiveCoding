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
    public List<String> binaryTreePaths(TreeNode root) {
        
        String stringBuilder = new String();
        List<String> list = new ArrayList();
        if(root==null) return list;
        
        binaryTreePathsWorker(root, stringBuilder, list);
        return list;
        
    }
    
    void binaryTreePathsWorker(TreeNode root, String s, List<String> list){
        
        s = s + "->" + root.val;
        
        if(root.left != null) binaryTreePathsWorker(root.left, s, list);
        
        if(root.right != null) binaryTreePathsWorker(root.right, s, list);
        
        if(root.left==null && root.right==null){
            list.add(s.substring(2));
            return;
        }
    }
}