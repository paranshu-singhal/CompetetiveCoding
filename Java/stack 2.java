import java.util.ArrayList;

public class stack {

    public static void main(String[] args){

        stackset st = new stackset();

        st.push(10);
        st.push(20);

        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());

        st.push(30);
        st.push(40);

        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(queue.pop());

    }

    public static class stackset {

        ArrayList<Integer> stack = new ArrayList<>();
        int size=0;

        public void push(int data){
            stack.add(new Integer(data));
            size++;
        }

        public int pop(){
            if(size==0){
                return -1;
            } else {
                int returnValue = stack.get(stack.size()-1).intValue();
                stack.remove(stack.size()-1);
                size--;
                return returnValue;
            }
        }

        public boolean isEmpty(){
            return stack.isEmpty();
        }
    }
}