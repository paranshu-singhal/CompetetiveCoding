/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        ListNode i=head;
        ListNode j=head;
        
        if(i==null) return null;
        
        if(i.next == null){
            return null;
        }
        
        while(i!=null && j!=null){
            
            if(i.next == null) return null;
            i=i.next.next;
            j=j.next;
            if(i==j) {
                ListNode t = head;
                while(t!=i){
                    t=t.next;
                    i=i.next;
                }
                return t;
            }
        }
        return null;
        
    }
}