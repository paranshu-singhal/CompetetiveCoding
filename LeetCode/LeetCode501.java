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
    public int[] findMode(TreeNode root) {
        
        Map<Integer, Integer> map = new HashMap();
        helper(root, map);
        
        int max = Integer.MIN_VALUE;
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
            } 
        }
        List<Integer> result = new ArrayList();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == max){
                result.add(entry.getKey());
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
        
    }
    
    void helper(TreeNode root, Map<Integer, Integer> map){
        if(root==null) return;
        
        helper(root.left, map);
        helper(root.right, map);
        
        if(map.containsKey(root.val)){
            map.put(root.val, map.get(root.val) + 1);
        } else {
            map.put(root.val, 1);
        }
    }
}