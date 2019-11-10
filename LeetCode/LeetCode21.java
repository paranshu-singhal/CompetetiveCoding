/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class LeetCode21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode head = null;
        ListNode tail = null;
        ListNode newnode = null;
        
        while(l1!=null && l2!=null){
            if(l1.val < l2.val){
                newnode = new ListNode(l1.val);
                l1 = l1.next;
            } else if(l1.val >= l2.val){
                newnode = new ListNode(l2.val);
                l2 = l2.next;
            }
            if(head == null){ head = newnode;}
            if(tail !=null) tail.next = newnode;
            
            tail = newnode;
        }
        while(l1!=null){
            newnode = new ListNode(l1.val);
            l1 = l1.next;
            if(head == null){ head = newnode;}
            if(tail!=null) tail.next = newnode;
            tail = newnode;
            
        }
        while(l2!=null){
            newnode = new ListNode(l2.val);
            l2 = l2.next;
            if(head == null){ head = newnode;}
            if(tail!=null) tail.next = newnode;
            tail = newnode;
            
        }
        return head;
        
    }
}