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
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prv =null;
        while(temp!=null){
            ListNode front = temp.next;
            temp.next = prv;
            prv = temp;
            temp = front;
        }
        // head.next = null;
        return prv;
    }
}