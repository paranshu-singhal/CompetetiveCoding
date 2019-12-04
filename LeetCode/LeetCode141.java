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
    public boolean hasCycle(ListNode head) {
        
        ListNode i=head;
        ListNode j=head;
        
        if(i==null) return false;
        
        if(i.next == null){
            return false;
        }
        
        while(i!=null && j!=null){
            
            if(i.next == null) return false;
            i=i.next.next;
            j=j.next;
            if(i==j) return true;
        }
        return false;
        
    }
}