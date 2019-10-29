/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null) return head;
        
        ListNode tail = head;
        int size=1;
        while(tail.next!=null){
            tail=tail.next;
            size++;
        }
        
        k = k%size;
        
        if(k==0) return head;
        
        ListNode new_head = head;
        ListNode new_tail = head;
        
        for(int i=0;i<size - k - 1; i++) new_tail = new_tail.next;
        new_head = new_tail.next;
        
        tail.next = head;
        new_tail.next = null;
        return new_head;
        
    }
}