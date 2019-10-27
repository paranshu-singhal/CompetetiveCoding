class Solution {
    public ListNode swapPairs(ListNode head) {
        
        if(head==null) return null;
            
        ListNode n1 = head;
        ListNode n2 = head.next;
        if(n2!=null){
            ListNode n3 = null;
            n3 = n2.next;
            n2.next = n1;
            n1.next = swapPairs(n3);
            return n2;
        }
        return n1;
    }
}