import java.util.List;
import java.util.ArrayList;
import java.lang.StringBuilder;

class LeetCode71 {

    public static void main(String[] args) {
        System.out.println(simplifyPath("/.."));
    }

    static String simplifyPath(String path) {
        
        List<String> q = new ArrayList();
        StringBuilder b = new StringBuilder();
        
        for(int i=0;i<path.length();i++){
            
            if(path.charAt(i) >='a' && path.charAt(i) <='z'){
                b.append(path.charAt(i));
            } else if(path.charAt(i) =='/'){
                if(b.length()>0) { 
                    q.add(b.toString()); 
                    b.delete(0, b.capacity()-1); 
                }     
            } else if(path.charAt(i) =='.'){
                if(i<path.length()-1){
                    if(path.charAt(i+1) == '.'){
                        if(q.size()>0) q.remove(q.size()-1);
                    }
                }
            }
        }

        if(q.size()==0) return "/";

        StringBuilder ans = new StringBuilder();
        for(int i=0;i<q.size();i++) {
            ans.append("/");
            ans.append(q.get(i));
        }
        return ans.toString();
    }
}

