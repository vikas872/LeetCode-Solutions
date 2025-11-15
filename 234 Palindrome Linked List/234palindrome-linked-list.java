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
    // public ListNode ListNode newHead=(ListNode head){
    public ListNode reverse(ListNode head){
        if (head == null || head.next == null) {
            return head;
        }

        ListNode front = head.next;
        ListNode newHead = reverse(head.next);
        front.next = head;
        head.next = null;
        return newHead;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode p1 = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode newHead = reverse(slow.next);
        ListNode p2 = newHead;
        while (p2 != null) {
            if (p1.val != p2.val) {
                reverse(newHead.next);
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        reverse(newHead.next);
        return true;
    }
}