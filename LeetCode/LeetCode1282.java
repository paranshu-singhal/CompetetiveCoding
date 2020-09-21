class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        
        
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        for(int i=0; i<groupSizes.length; i++){
            List<Integer> list = map.getOrDefault(groupSizes[i], new ArrayList<Integer>());
            list.add(i);
            map.put(groupSizes[i], list);
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for(Map.Entry<Integer, List<Integer>> item: map.entrySet()) {
            
            int bucket = item.getKey();
            List<Integer> list = item.getValue();
            
            if(list.size() == bucket) {
                ans.add(list);
            }
            else {
                int chunk = list.size() / bucket;
                for(int i=0; i<chunk; i++) {
                    List<Integer> list2 = new ArrayList();
                    for(int j = (i*bucket); j < (i*bucket) + bucket; j++) {
                        list2.add(list.get(j));
                    }
                    ans.add(list2);
                }
            }
        }
        
        return ans;
    }
}