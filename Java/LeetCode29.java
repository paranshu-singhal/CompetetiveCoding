import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LeetCode29 {
    public static int divide(int dividend, int divisor) {
        
        boolean neg = false;
        int q = 0;
        
        if((dividend<0 && divisor>0) || (dividend>0 && divisor<0)) neg=true;
        
        if(dividend==-2147483648 && divisor==-1){
            return 2147483647;
        } else if(dividend == -2147483648){
            
            if(divisor>0){
                divisor = 0-divisor; 
            } 
            while(dividend<=divisor){
                    dividend = dividend - divisor;
                    q++;
                }
        }
        else {
            dividend = Math.abs(dividend);
            divisor = Math.abs(divisor);
        
            //int q = 0;
        
            while(dividend>=divisor){
                dividend = dividend - divisor;
                q++;
            }
        }
        if (neg){
            q = 0-q;
        }
        return q;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int dividend = Integer.parseInt(line);
            line = in.readLine();
            int divisor = Integer.parseInt(line);
            
            int ret = divide(dividend, divisor);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}