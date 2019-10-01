import java.util.ArrayList;

public class BinaryTree {

    public static void main(String[] args){

        treenode root = buildtree();
        inorder(root);
        System.out.println(" ");
        preorder(root);
        System.out.println(" ");
        postorder(root);
        System.out.println(" ");
        levelorder(root);
        System.out.println(" ");

        System.out.println(height(root));
    }

    public static treenode buildtree(){
        treenode root = new treenode(1);

        root.left = new treenode(2);
        root.right = new treenode(3);

        root.left.left = new treenode(4);
        root.left.right = new treenode(5);

        root.right.left = new treenode(6);
        root.right.right = new treenode(7);

        return root;
    }

    public static void inorder(treenode root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(new Integer(root.data).toString().concat(" "));
        inorder(root.right);
    }

    public static void preorder(treenode root){
        if(root == null) return;
        System.out.print(new Integer(root.data).toString().concat(" "));
        preorder(root.left);   
        preorder(root.right);
    }

    public static void postorder(treenode root){
        if(root == null) return;
        postorder(root.left);   
        postorder(root.right);
        System.out.print(new Integer(root.data).toString().concat(" "));
    }

    public static void levelorder(treenode root){
        ArrayList<treenode> queue = new ArrayList();
        queue.add(root);

        while(!queue.isEmpty()){
            treenode node = queue.get(0);
            queue.remove(0);
            System.out.print(new Integer(node.data).toString().concat(" "));
            if(node.left!=null) queue.add(node.left);
            if(node.right!=null) queue.add(node.right);
        }
    }

    public static int height(treenode root){
        if(root==null) return -1;
        return Math.max(height(root.left), height(root.right)) + 1;
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