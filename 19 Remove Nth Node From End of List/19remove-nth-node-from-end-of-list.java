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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        ListNode fast = head;
        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        ListNode slow = head;
        if(fast==null){
            head = head.next;
            return head;
        }
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        ListNode del = slow.next;
        slow.next = del.next;
        del.next = null;
        return head;
    }
}