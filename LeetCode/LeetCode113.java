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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> finalList = new ArrayList();
        List<Integer> list = new ArrayList();
        helper(root,0,sum,list,finalList);
        return finalList;
    }
    
    void helper(TreeNode root, int sum, int target, List<Integer> list, List<List<Integer>> finalList){
        
        if(root==null) return;
        
        sum += root.val;
        list.add(root.val);
        if(root.left==null && root.right==null && sum==target){
            finalList.add(new ArrayList(list));
            list.remove(list.size()-1);
            return;
        } 
        
        helper(root.left,  sum, target, list, finalList);
        helper(root.right, sum, target, list, finalList);
        System.out.println(Arrays.toString(list.toArray()));
        list.remove(list.size()-1);
        
    }
}