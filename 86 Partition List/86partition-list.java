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
    public ListNode partition(ListNode head, int x) {
        // if(head==null || head.next==null){
        //     return head;
        // }
        ListNode small = new ListNode(-1);
        ListNode large = new ListNode(-1);
        ListNode sp = small;
        ListNode lp = large;
        ListNode temp = head;
        while(temp!=null){
            if(temp.val<x){
                sp.next = temp;
                sp = sp.next;
                temp = temp.next;
            }else{
                lp.next = temp;
                lp = lp.next;
                temp = temp.next;
            }
        }
        lp.next = null;
        sp.next = large.next;
        return small.next;
    }
}