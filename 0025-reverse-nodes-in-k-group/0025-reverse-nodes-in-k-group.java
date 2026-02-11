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

    static ListNode reverse(ListNode head){
        if(head==null || head.next==null){
            return head;
        }

        ListNode temp = head;
        ListNode prv = null;

        while(temp!=null){
            ListNode front = temp.next;
            temp.next = prv;
            prv = temp; 
            temp = front;
        }
        return prv;
    }
    static ListNode findK(ListNode head, int k){
        ListNode temp = head;
        int cnt = 0;
        while(temp!=null){
            cnt++;
            if(cnt==k){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode nextNode = temp;
        ListNode prv = null;
        while(temp!=null){
            ListNode kth = findK(temp,k);
            if(kth==null){
                if(prv!=null){
                    prv.next = temp;
                    break;
                }else{
                    return head;
                }
            }
            nextNode = kth.next;
            kth.next = null;
            ListNode newHead = reverse(temp);
            if(temp==head){
                // head.next = nextNode;
                head = kth;
            }else{
                prv.next = kth;
            }

            prv = temp;
            temp  = nextNode;

        }
        return head;
    }
}