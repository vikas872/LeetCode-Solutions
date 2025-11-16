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
    public ListNode[] splitListToParts(ListNode head, int k) {
    //     if(head==null || head.next==null){
    //         return new ListNode[k] {head};
    //     }
        ListNode curr = head;
        int len = 0;
        while(curr!=null){
            len++;
            curr = curr.next;
        }
        curr  = head;
        int each = len/k;
        int rem = len%k;
        ListNode prv = null;
        ListNode[] result = new ListNode[k];
         for(int i=0; i<k;i++){
            result[i] = curr;
            int size = each + (rem>0?1:0);
            rem--;

            for(int cnt = 0; cnt<size;cnt++){
                prv = curr;
                if(curr!=null){
                    curr = curr.next;
                }
            }
            if(prv!=null){
                prv.next = null;
            }
          
         }
         return result;
    }
}