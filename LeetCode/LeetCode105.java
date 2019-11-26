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
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            hash.put(inorder[i],i);
        }
        
        return helper(inorder, 0, inorder.length-1, preorder, 0, preorder.length-1);
    }
    
    TreeNode helper(int[] inorder, int inStart, int inEnd, int[] preorder, int preStart, int preEnd){
        
        if(inStart>inEnd || preStart>preEnd) return null;
        
        int val = preorder[preStart];
        TreeNode node =  new TreeNode(val);
        
        int k = hash.get(val);
        
        node.left = helper(inorder, inStart, k-1, preorder, preStart+1, preStart + k-inStart);
        node.right = helper(inorder, k+1, inEnd, preorder, preStart + (k-inStart) + 1, preEnd);
        return node;
        
    }
}