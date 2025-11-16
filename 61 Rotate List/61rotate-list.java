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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        int len = 1;
        ListNode tail = head;
        while(tail.next!=null){
            len = len+1;
            tail = tail.next;
        }
        if(k%len==0){
            return head;
        }
        else{
            k = k%len;
        }
        tail.next = head;
        ListNode newTail = head;
        int cnt = 1;
        while(cnt!=len-k){
            newTail = newTail.next;
            cnt++;
        }
        ListNode newHead = newTail.next  ;
        newTail.next = null;
        return newHead;

    }
}