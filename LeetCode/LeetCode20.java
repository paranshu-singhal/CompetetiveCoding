import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class LeetCode20 {

    public boolean isValid(String s) {

        List<Character> st = new ArrayList<Character>();

        for(int i=0;i<s.length();i++){

            Character t = s.charAt(i);

            if(st.isEmpty() && (t==")" || t=="}" || t=="]")){
                return false;
            }

            if(t=="(" || t=="{" || t=="["){
                st.add(t);
            }
            else {
                if(st.get(st.size()-1) == t){
                    st.remove(st.size()-1);
                } else {
                    return false;
                }
            }
        }
        return true;
        
    }
}