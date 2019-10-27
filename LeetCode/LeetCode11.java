public class LeetCode11{
    public static void main(String[] args) {
        
        int[] height = new int[args.length];

        for(int i=0;i<args.length;i++){
            height[i] = Integer.parseInt(args[i]);
        }
        
        System.out.println(ContainerWithMostWater(height));
    }
    public static int ContainerWithMostWater(int[] height) {
            
        int p1 = 0; int p2 = height.length-1;
        
        int maxarea = Integer.MIN_VALUE;
        
        while(p1<p2){
           int n1 = height[p1];
           int n2 = height[p2];

           if(n1 < n2){
                maxarea = Math.max(maxarea, (n2-n1)*(p2-p1));
                p1++;
           } else {
               maxarea = Math.max(maxarea, (n1-n2)*(p2-p1));
               p2--;
           }
        }
        return maxarea;
    }
} 