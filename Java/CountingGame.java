import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class CountingGame {

    static int result = 0;


    public static void main(String[] args) {
        //count(42);
        System.out.println(count(Integer.parseInt(args[0])));
    }

    static int reverse(int x){

        int y = 0;
        while(x>0){
            y = 10*y + x%10;
            x=x/10;
        }
        return y;
    }

    static int count(int x){

        if(x==1) return 1;

        if(x<1) return Integer.MAX_VALUE;

        int min1 = 1 + count(x-1);
        
        int rev = reverse(x);

        int min2 = Integer.MAX_VALUE;
        if(rev < x && x%10!=0) min2 = 1 + count(rev);

        return Math.min(min1, min2);
    }

}