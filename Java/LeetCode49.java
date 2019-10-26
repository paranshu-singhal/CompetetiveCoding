import java.lang.Integer;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;

/**
 * LeetCode49
 */
public class LeetCode49 {
    public static void main(String[] args) {
        
        String[] strs = {"cab","tin","pew","duh","may","ill","buy","bar","max","doc"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap();
        int[] count = new int[26];                                                                                                                                                                   

        for(int i=0; i<strs.length; i++){
            
            Arrays.fill(count, 0);
            String s = strs[i];

            for(int j=0;j<s.length();j++) count[(int)s.charAt(j) - 97]++;
            
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < 26; j++) {
                sb.append('#');
                sb.append(count[j]);
            }
            String key = sb.toString();

            if(!map.containsKey(key)){
                List<String> val = new ArrayList();
                val.add(s);
                map.put(key, val);
            } else {
                List<String> val = map.get(key);
                val.add(s);
                map.put(key, val);
            }
        }
        List<List<String>> res = new ArrayList();
        map.forEach((k, v) -> res.add(v));
        return res;
    }
        
}
    

