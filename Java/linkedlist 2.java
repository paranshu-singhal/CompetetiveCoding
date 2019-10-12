public class linkedlist {

    
    static node head = null, tail = null;

    public static void main(String[] args) {

        insert(10);
        insert(2);
        insert(87);

        display();
        System.out.println(find(87));
        delete(87);
        display();

    }

    public static void insert(int data){

        node n = new node();
        n.data = data;

        if(head == null){
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    public static int find(int data){
        node n = head;
        int ctr = 1;
        while(n.data != data){
            n = n.next;
            ctr++;
        }
        return ctr;
    }

    public static void delete (int data){
        node n1 = head;
        node n2 = head.next;

        if(n1.data == data){
            head=head.next;
        } else{
            while(n2.data != data){
                n1=n1.next; n2=n2.next;   
            }
            n1.next = n2.next;
        }
    }

    public static void display(){
        node n = head;
        while(n!=null){
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static class node {
        int data;
        node next;
    }

}