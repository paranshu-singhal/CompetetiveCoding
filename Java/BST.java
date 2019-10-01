public class BST {

    public static void main(String[] args){

        treenode root = new treenode(100);
        root.left=null;
        root.right=null;
        
        insert(root, 140);
        insert(root, 80);
        insert(root, 70);
        insert(root, 90);

        inorder(root);
        System.out.println(" ");

        delete(root, 80);

        inorder(root);
        System.out.println(" ");
    }

    public static treenode delete(treenode root, int data){

        if(root == null) return null;

        if(data < root.data){
            root.left = delete(root.left, data);
        } else if(data > root.data){
            root.right = delete(root.right, data);
        } else{
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;

            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }   
        return root;

    }

    static int minValue(treenode root){
        int minV = root.data;
        while(root.left!=null){
            minV = root.left.data;
            root=root.left;
        }
        return minV;
    }
    
    public static void insert(treenode root, int data){

        if(root==null) {
            treenode newnode = new treenode(data);
            newnode.left = null;
            newnode.right = null;
            root = newnode;
        }

        if(data < root.data && root.left == null) {
            treenode newnode = new treenode(data);
            newnode.left = null;
            newnode.right = null;
            root.left = newnode;
        } else if(data > root.data && root.right == null) {
            treenode newnode = new treenode(data);
            newnode.left = null;
            newnode.right = null;
            root.right = newnode;
        } else if(data < root.data){
            insert(root.left, data);
        } else if(data > root.data){
            insert(root.right, data);
        }
    }
    

    public static boolean search (treenode root, int data) {
        
        if(root==null) return false;
        if(root.data == data) return true;
        if(data < root.data){
            search(root.left, data);
        }
        if(data > root.data){
            search(root.right, data);
        }
        return false;
    }

    public static void inorder(treenode root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(new Integer(root.data).toString().concat(" "));
        inorder(root.right);
    }

    public static class treenode {

        int data;
        treenode left;
        treenode right;

        treenode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
}