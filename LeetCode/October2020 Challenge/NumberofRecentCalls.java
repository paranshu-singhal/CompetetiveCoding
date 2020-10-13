class RecentCounter {
    
    List<Integer> db;
    int last=0;

    public RecentCounter() {
        db = new ArrayList<>();
    }
    
    public int ping(int t) {
        db.add(t);
        int t1 = db.size();
        
        int t2=last;
        if(t-3000>0) {
            while(db.get(t2) < t-3000){ t2++; }
            int result = t1-t2;
            t2=last;
            return result;
        } else {
            return t1;
        }
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */