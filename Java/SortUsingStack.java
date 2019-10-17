import java.util.Stack;

public class SortUsingStack {

    public static void main(String[] args){

        //int[] array = new int[args.length];
        Stack<Integer> stack = new Stack<Integer>(); 

        for(int i=0; i<args.length;i++){
            stack.push(Integer.parseInt(args[i]));
        }
        System.out.println(sort(stack).toString());
    }

    public static Stack<Integer> sort(Stack<Integer> stack){
        
        Stack<Integer> tmpStack = new Stack<Integer>(); 

        while(!stack.empty()){
            int n = stack.pop();
            while(!tmpStack.empty() && n < tmpStack.peek()){
                int n2 = tmpStack.pop();
                stack.push(n2);
            }
            tmpStack.push(n);
        }
        return tmpStack;
    }
}