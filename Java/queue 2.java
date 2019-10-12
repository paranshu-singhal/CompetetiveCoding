import java.util.ArrayList;

public class queue {

    public static void main(String[] args){

        queueset queue = new queueset();

        queue.push(10);
        queue.push(20);

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());

        queue.push(30);
        queue.push(40);

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());

    }

    public static class queueset{

        ArrayList<Integer> queue = new ArrayList<>();
        int size = 0;

        public void push(int data){
            queue.add(new Integer(data));
            size++;
        }

        public int pop(){
            
            if(size==0) return -1;
            
            int returnValue = queue.get(0);
            queue.remove(0);
            size--;
            return returnValue;

        }
    }
}