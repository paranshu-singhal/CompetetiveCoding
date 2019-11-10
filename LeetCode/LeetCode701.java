/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class LeetCode701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        if(root == null){
            TreeNode node = new TreeNode(val);
            return node;
        }
        
        if(val < root.val){
            if(root.left!=null) insertIntoBST(root.left, val);
            else {
                TreeNode node = new TreeNode(val);
                root.left = node;
                
            }
        } 
        else {
            if(root.right!=null) insertIntoBST(root.right, val);
            else {
                TreeNode node = new TreeNode(val);
                root.right = node;
            }
        }
        return root;
    }
    
}