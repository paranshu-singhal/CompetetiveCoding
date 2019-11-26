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
    HashMap<Integer, Integer> hash = new HashMap();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        for(int i=0;i<inorder.length;i++){
            hash.put(inorder[i],i);
        }
        
        return helper(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
    }
    
    TreeNode helper(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd){
        
        if(inStart>inEnd || postStart>postEnd) return null;
        
        int val = postorder[postEnd];
        TreeNode node =  new TreeNode(val);
        
        int k = hash.get(val);
        
        node.left = helper(inorder, inStart, k-1, postorder, postStart, postStart + k-inStart-1);
        node.right = helper(inorder, k+1, inEnd, postorder, postStart + (k-inStart) , postEnd-1);
        return node;
        
    }
}