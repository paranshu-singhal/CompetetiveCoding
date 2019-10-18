public class LeetCode6 {

    public static void main(String[] args) {
        System.out.println(convert("Paranshu", 3));
    }
    
    public static String convert(String s, int numRows) {
        
        char[][] c = new char[numRows][s.length()];

        c[0][0] = s.charAt(0);
        int l=0;
        int i=0; int j = 0;
        while(l<s.length()){
            for(int x = 1; x<numRows; x++){
                i++; l++;
                if(l<s.length()){
                    c[i][j] = s.charAt(l);
                }
                else break;
                
            }
            for(int x = 1; x<numRows; x++){
                i--; j++; l++;
                if(l<s.length()){
                    c[i][j] = s.charAt(l);
                }
                else break;
                //c[i][j] = s.charAt(l);
            }
        }

        StringBuilder ans = new StringBuilder();
        for(int x1=0;x1<numRows;x1++){
            for(int x2=0;x2<s.length();x2++){
                if(c[x1][x2]!=0){
                    ans.append(c[x1][x2]);
                }
            }
        }
        return new String(ans);
    }
}