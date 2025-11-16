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
    public ListNode reverse(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode last = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
    public void reorderList(ListNode head) {
      

        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;

        }
        ListNode rev = reverse(slow.next);
        slow.next = null; // Cut the list in two
        ListNode curr = head;
        while(rev!=null){
            ListNode tempcurr = curr.next;
            ListNode temprev = rev.next;
            curr.next = rev;
            rev.next = tempcurr;
            curr = tempcurr;
            rev = temprev;
        }
        // return head;
    }
}