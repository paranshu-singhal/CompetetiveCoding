public class LeetCode2 {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        //l1.next.next = new ListNode(9);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);
        l2.next.next.next.next = new ListNode(9);

        //System.out.println();
        ListNode l3 = addTwoNumbers(l1,l2);
        while(l3!=null){
            System.out.println(l3.val);
            l3 = l3.next;
        }

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbersRecurese(l1, l2, 0, 0);
    }
    
    public static ListNode addTwoNumbersRecurese(ListNode l1, ListNode l2, int borrow, int currNum) {

        if(l1 == null && l2 == null){
            if(borrow == 1){
                return new ListNode(1);
            } else {
                return null;
            }
        }

        int add = 0;
        if(l1 == null && l2!=null){
            add = l2.val + borrow;
        } else if(l1 != null && l2==null){
            add = l1.val + borrow;
        } else {
            add = l1.val + l2.val + borrow;
        }
        borrow=0;
        if(add>9){
            borrow = 1;
            add = add%10;
        }
        // currNum = currNum*10 + (add/10);
        // return addTwoNumbersRecurese(l1.next, l2.next, borrow, currNum);
        ListNode n = new ListNode(add);
        if(l1!=null) l1 = l1.next; if(l2!=null) l2 = l2.next; 
        n.next = addTwoNumbersRecurese(l1, l2, borrow, currNum);
        return n;
    }
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}

