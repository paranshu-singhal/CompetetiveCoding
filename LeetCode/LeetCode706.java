class MyHashMap {

    /** Initialize your data structure here. */
    
    int[] val;
    boolean[] set;
    public MyHashMap() {
        val = new int[1000001];
        set = new boolean[1000001];
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        val[key] = value;
        set[key] = true;
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        return (set[key])?val[key]:-1;
        //return val[key];
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        set[key] = false;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */