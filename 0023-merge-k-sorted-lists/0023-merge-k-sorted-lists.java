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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = lists.length;
        for(int i=0;i<n;i++){
            ListNode temp = lists[i];
            ListNode curr = temp;
            while(curr!=null){
                ans.add(curr.val);
                curr = curr.next;

            }
        }
        if (ans.size() == 0) return null;
        Collections.sort(ans);
        ListNode head = new ListNode(ans.get(0));
        ListNode tem = head;
        for(int i=1;i<ans.size();i++){
            ListNode curr2 = new ListNode(ans.get(i));
            tem.next = curr2;
            tem = tem.next;
        }
        return head;

    }
}