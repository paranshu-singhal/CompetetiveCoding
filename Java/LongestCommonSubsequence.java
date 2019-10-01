import java.util.Scanner;

public class LongestCommonSubsequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        System.out.println(findLCS(s1,s2,0,0));

        scanner.close();
    }

    static int findLCS(String s1, String s2, int i, int j){
        
        if(i==s1.length() || j==s2.length()) return 0;

        if(s1.charAt(i) == s2.charAt(j)) return findLCS(s1,s2,i+1,j+1)+1;

        return Math.max(
            findLCS(s1,s2,i+1,j),
            findLCS(s1,s2,i,j+1)
        );
    }

}