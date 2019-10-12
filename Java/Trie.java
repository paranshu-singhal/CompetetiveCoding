import java.util.List;

public class Trie {

    public static void main(String[] args){
        String s = new String("paranshu");

        trienode root = new trienode();
        insert_string(s, root);
        System.out.println(contains_string("paranshi", root));
        System.out.println(contains_string("paranshu", root));
    }

    public static void insert_string(String s, trienode root){

        trienode root_temp = root;
        int j=0;

        while(j<s.length()){
            int char_num = ((int)s.charAt(j) - 97);
            if(root_temp.nodes[char_num] != null){
                j++; 
                root_temp = root_temp.nodes[char_num];
                continue;
            } else {
                trienode new_node = new trienode();
                if(j==s.length() - 1) new_node.eow = true;
                root_temp.nodes[char_num] = new_node;
                root_temp = new_node;
                j++;
            }
        }
    }

    public static Boolean contains_string(String s, trienode root){
        trienode root_temp = root;
        int j=0;
        while(j<s.length()){
            int char_num = ((int)s.charAt(j) - 97);
            if(root_temp.nodes[char_num] != null){
                j++; 
                root_temp = root_temp.nodes[char_num];
                continue;
            } else {
                return false;
            }
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