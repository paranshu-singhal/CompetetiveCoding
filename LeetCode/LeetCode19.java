class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head==null){
            return null;
        }
        
        ListNode n1;
        ListNode n3;
        ListNode n4 = head;
        
        for(int i=0;i<n;i++){n4 = n4.next;}
        
        if(n4==null){
            head=head.next;
            return head;
        }
        
        n1=head;
        n3=n1.next.next;
        
        while(n4.next!=null){
            n4=n4.next; n3=n3.next; n1=n1.next;
        }
        
        n1.next=n3;
        return head;
    }
}

public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}