/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
    //     ListNode temp = head;
    //  //   ListNode prv = null
    //     int k = node.val;
    //     while(temp.next.val!=k){
    //         // prv = temp;
    //         temp = temp.next;
    //     }
    //     temp.next = temp.next.next;
        // return head;
        node.val = node.next.val;
        node.next = node.next.next;
        


    }
}