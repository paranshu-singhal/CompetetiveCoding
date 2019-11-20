class MyHashSet {
    
    /** Initialize your data structure here. */
    
    class Node {
        int val;
        Node left;
        Node right;
        
        Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    
    Node root;
    
    Node deleteRec(Node root, int key)  { 

        if (root == null)  return root; 
  
        if (key < root.val) 
            root.left = deleteRec(root.left, key); 
        else if (key > root.val) 
            root.right = deleteRec(root.right, key); 
  
        else { 
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left; 
 
            root.val = minValue(root.right); 
            root.right = deleteRec(root.right, root.val); 
        } 
  
        return root; 
    } 
    
    int minValue(Node root) { 
        int minv = root.val; 
        while (root.left != null) 
        { 
            minv = root.left.val; 
            root = root.left; 
        } 
        return minv; 
    } 
    
    public MyHashSet() {
        root = null;
    }
    
    public void add(int key) {
        if(root==null) {root = new Node(key); return; }
        
        Node t = root;
        while(true){
            if(key<t.val){
                if(t.left==null) {t.left = new Node(key); break;}
                else{
                    t = t.left;
                }
            }
            else if(key==t.val) break;
            else {
                if(t.right==null) {t.right = new Node(key); break;}
                else{
                    t = t.right;
                }
            }
        }
        return;
    }
    
    public void remove(int key) {
        root = deleteRec(root, key); 
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        if(root==null) return false;
        
        Node t = root;
        while(true){
            if(key<t.val){
                if(t.left==null) return false;
                else{
                    t = t.left;
                }
            }
            else if(key==t.val) return true;
            else {
                if(t.right==null) return false;
                else{
                    t = t.right;
                }
            }
        }
        //return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */