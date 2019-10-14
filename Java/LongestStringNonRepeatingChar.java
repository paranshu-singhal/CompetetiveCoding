import java.util.Scanner;

public class LongestStringNonRepeatingChar {
    
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in); 
        String s1 = scanner.nextLine();
        System.out.println(lengthOfLongestSubstring(s1));
    }

    static int convertToNum(char c){
        return (int)c;
    }

    public static int lengthOfLongestSubstring(String s) {

        int prev_index;
        int cur_len = 1; int max_len = 1;

        int[] hash = new int[256];
        for(int i=0;i<26;i++) hash[i] = -1;
        hash[convertToNum(s.charAt(0))]=0;

        for(int i=1;i<s.length();i++){
            
            prev_index = hash[convertToNum(s.charAt(i))];

            if(prev_index == -1 || prev_index < (i - cur_len)){
                cur_len++;
            } else {
                cur_len = i-prev_index;
                
            }
            hash[convertToNum(s.charAt(i))] = i;
            max_len = Math.max(cur_len, max_len);
            
        }

        return max_len;

        // int start = 0, end = 0;
        // int maxlength = 1;
        
        // int[] hash = new int[26];
        
        // hash[(int)s.charAt(start) - 97] = 1;
        // int char_num = 0;
            
        // while(end<s.length()-1){
        //     end++;
        //     char_num = (int)s.charAt(end) - 97;
        //     if(hash[char_num]==0){
        //         maxlength = (maxlength<(end-start+1))?(end-start+1):maxlength;    
        //     }
        //     hash[char_num]++;
            
        //     while(hash[char_num]>1){
        //         hash[(int)s.charAt(start) - 97]--;
        //         start++;
        //     }
        // }
        //return maxlength;
    }

}