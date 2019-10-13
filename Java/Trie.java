import java.util.List;

public class Trie {

    public static void main(String[] args){


        trienode root = new trienode();
        insert_string("paranshusinghal", root);
        insert_string("paranshu", root);
        System.out.println(contains_string("paranshi", root));
        System.out.println(contains_string("paranshu", root));
        System.out.println(contains_string("paranshusinghal", root));

        insert_string("paranshu", root);
        System.out.println(contains_string("paranshu", root));

        delete_string("paranshu", root, 0);
        System.out.println(contains_string("paranshu", root));

        insert_string("paranshu", root);
        delete_string("paranshusinghal", root, 0);
        System.out.println(contains_string("paranshu", root));
        System.out.println(contains_string("paranshusinghal", root));

    }

    public static void insert_string(String s, trienode root){

        trienode root_temp = root;
        int j=0;

        for(int i=0;i<s.length();i++){
            int char_num = ((int)s.charAt(i) - 97);
            if(root_temp.nodes[char_num] == null){
                trienode new_node = new trienode();
                root_temp.nodes[char_num] = new_node;
            }
            root_temp = root_temp.nodes[char_num];
        }
        root_temp.eow = true;
    }

    public static Boolean contains_string(String s, trienode root){
        trienode root_temp = root;
        for(int i=0;i<s.length();i++){
            int char_num = ((int)s.charAt(i) - 97);
            if(root_temp.nodes[char_num] == null) return false;
            root_temp = root_temp.nodes[char_num];
        }
        return true && (root_temp.eow == true);
    }
        
    public static trienode delete_string(String s, trienode root, int depth){

        if(root==null) return null;
        
        if(depth == s.length()){

            root.eow = false;
            if(isEmpty(root)){
                root = null;
            }
            return root;
        }
        int char_num = (int)s.charAt(depth) - 97;
        root.nodes[char_num] = delete_string(s,root.nodes[char_num], depth+1);

        if(isEmpty(root) && root.eow == false){
            root = null;
        }
        return root;
    }

    static boolean isEmpty(trienode root){
        trienode[] nodes = root.nodes;
        for(int i=0;i<26;i++){
                if(nodes[i]!=null) return false;
            }
        return true;
    }

    public static class trienode {

        trienode[] nodes = new trienode[26];
        boolean eow = false;

        trienode(){
            for(int i=0;i<26;i++){
                nodes[i] = null;
            }
        }
    }
}