import java.util.Scanner;
public class LongestPalindromicSubstringUsingDP {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        String s1 = scanner.nextLine();
        //String s2 = scanner.nextLine();

        System.out.println(findLPS(s1));

        scanner.close();
    }

    static String findLPS(String s1){

        int n = s1.length();

        if(n==0) return "";

        int[][] dp = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0;j<n;j++){
                if(i>j) dp[i][j] = 0;
                else if(i==j) dp[i][j] = 1;
            }
        }

        int start=0;
        int maxlength=1;

        for(int k=1;k<n;k++){
            for(int i=0;i<n-k;i++){
                int j = i+k;
                int p1 = 0;

                if(s1.charAt(i) == s1.charAt(j) && (j-i-1) == dp[i+1][j-1]){
                    p1 = (j-i+1);
                }
                int p2 = dp[i+1][j];
                int p3 = dp[i][j-1];
                
                dp[i][j] = Math.max(p1, Math.max(p2,p3));
                if(Math.max(p1, Math.max(p2,p3)) > maxlength){
                    maxlength = Math.max(p1, Math.max(p2,p3));
                    start = i;
                }
                
            }
        }

        return s1.substring(start, start+maxlength);
    }
}