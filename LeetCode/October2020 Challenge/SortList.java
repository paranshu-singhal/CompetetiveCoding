/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        head = sort(head);
        return head;
    }
    
    ListNode sort(ListNode h) {
        if (h == null || h.next == null) { 
            return h; 
        } 
  
        ListNode middle = getMiddle(h); 
        ListNode nextofmiddle = middle.next; 
  
        middle.next = null; 
        ListNode left = sort(h); 
  
        ListNode right = sort(nextofmiddle); 
  
        ListNode sortedlist = sortedMerge(left, right); 
        return sortedlist; 
    }
    ListNode getMiddle(ListNode head) { 
        if (head == null) 
            return head; 
  
        ListNode slow = head, fast = head; 
  
        while (fast.next != null && fast.next.next != null) { 
            slow = slow.next; 
            fast = fast.next.next; 
        } 
        return slow; 
    }
    ListNode sortedMerge(ListNode a, ListNode b) { 
        ListNode result = null; 
        
        if (a == null) 
            return b; 
        if (b == null) 
            return a; 
  
        if (a.val <= b.val) { 
            result = a; 
            result.next = sortedMerge(a.next, b); 
        } 
        else { 
            result = b; 
            result.next = sortedMerge(a, b.next); 
        } 
        return result; 
    }
    
}