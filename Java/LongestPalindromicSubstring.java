import java.util.Scanner;
public class LongestPalindromicSubstring {

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

        int p1=0;

        if(s1.charAt(i) == s1.charAt(j)){
            int remainingLength = j-i+1;
            if(remainingLength == findLPS(s1, i+1, j-1)) p1 = remainingLength+2;
        }
        int p2 = findLPS(s1,i+1,j);
        int p3 = findLPS(s1,i,j-1);

        return Math.max(p1, Math.max(p2,p3));
    }
}