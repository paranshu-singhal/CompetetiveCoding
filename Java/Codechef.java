import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // your code goes here
        
        Scanner scanner = new Scanner(System.in); 
        //String t = ;
        int t = Integer.parseInt(scanner.nextLine().split(" ")[0]);
        //System.out.println(t);

        while(t > 0){
            String[] nd = scanner.nextLine().split(" ");
            int n = Integer.parseInt(nd[0]);
            int q = Integer.parseInt(nd[1]);

            int[] P = new int[n];
            String[] aItems = scanner.nextLine().split(" ");

            for (int i = 0; i < n; i++) {
                int aItem = Integer.parseInt(aItems[i]);
                P[i] = aItem;
            }

            Arrays.sort(P); 

            for(int i=0;i<q; i++){
                int x = scanner.nextInt();

                int ans=0;

                for(int j=0;j<n;j++){
                    if(x>P[j]){
                        ans++;
                        x = 2*( x - P[j]);
                    } else {
                        break;
                    }
                }
                System.out.println(ans);
            }
            t=t-1;
        }
        scanner.close();
	}
}