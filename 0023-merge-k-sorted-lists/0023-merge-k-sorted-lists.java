class Solution {

    class Pair {
        int val;
        ListNode node;

        public Pair(int val, ListNode node) {
            this.val = val;
            this.node = node;
        }
    }

    public ListNode mergeKLists(ListNode[] arr) {

        PriorityQueue<Pair> pq =
            new PriorityQueue<>((a, b) -> a.val - b.val);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                pq.add(new Pair(arr[i].val, arr[i]));
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            ListNode currNode = curr.node;

            temp.next = currNode;
            temp = temp.next;

            if (currNode.next != null) {
                pq.add(new Pair(currNode.next.val, currNode.next));
            }
        }

        return dummy.next;
    }
}
