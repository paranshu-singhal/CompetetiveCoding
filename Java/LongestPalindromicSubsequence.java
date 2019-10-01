import java.util.Scanner;

public class LongestPalindromicSubsequence {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); 
        String s1 = scanner.nextLine();
        //String s2 = scanner.nextLine();

        System.out.println(findLPS(s1,0,s1.length()-1));

        scanner.close();
    } 

    static int findLPS(String s1, int i, int j){

        if(i>j) return 0;
        if(i==j) return 1;

        if(s1.charAt(i) == s1.charAt(j)) return findLPS(s1,i+1,j-1) + 2;

        return Math.max(findLPS(s1,i+1,j), findLPS(s1,i,j-1));
    }
}