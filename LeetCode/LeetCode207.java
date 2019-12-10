class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        int len = prerequisites.length;
        int[] vis = new int[numCourses];
        
        HashMap<Integer, List<Integer>> map = new HashMap();
        
        for(int i=0; i<len; i++){
            
            if(!map.containsKey(prerequisites[i][1])){
                List<Integer> l = new ArrayList();
                l.add(prerequisites[i][0]);
                map.put(prerequisites[i][1], l);
            } else {
                map.get(prerequisites[i][1]).add(prerequisites[i][0]);
            }
        }
        
        for(int i=0; i<numCourses; i++){
            if(!dfsUtil(map, vis, i)) return false;
        }
        return true;
                
    }
    
    boolean dfsUtil( HashMap<Integer, List<Integer>> map, int[] vis, int i){
        
        if(vis[i] == -1) return false;
        
        if(vis[i] == 1) return true;
        
        vis[i] = -1;
        
        if(map.containsKey(i)){
            for(int j: map.get(i)){
                
                if(!dfsUtil(map, vis, j)) return false;
            }
        }
        
        vis[i] = 1;
        
        return true;
        
    }
    
}