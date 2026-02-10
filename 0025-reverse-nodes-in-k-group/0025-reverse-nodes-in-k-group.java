class Solution {
    
    // Your 'rev' function, but with the base case
    public ListNode rev(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
    
    // 'getK' helper is good, but we can do it inline
    
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        // 1. Use a dummy node
        ListNode dummy = new ListNode(0, head);
        // 'prevGroup' points to the tail of the *previous* group
        ListNode prevGroup = dummy; 
        
        while (true) {
            // 2. Find the k-th node
            ListNode kthNode = prevGroup;
            for (int i = 0; i < k; i++) {
                kthNode = kthNode.next;
                if (kthNode == null) {
                    // List is shorter than k, we're done
                    return dummy.next;
                }
            }
            
            // 3. Save the start of the *next* group
            ListNode nextGroupHead = kthNode.next;
            
            // 4. "Cut" the k-group
            kthNode.next = null;
            
            // 5. Reverse the k-group
            // We are reversing the list starting from 'prevGroup.next'
            ListNode reversedHead = rev(prevGroup.next);
            
            // 6. Stitch the lists back together
            
            // The tail of the *old* group (e.g., node 1)
            // is now at 'prevGroup.next'
            ListNode reversedTail = prevGroup.next;
            
            // Stitch 1: dummy -> 2
            prevGroup.next = reversedHead;
            // Stitch 2: 1 -> 4
            reversedTail.next = nextGroupHead;
            
            // 7. Move pointers for next iteration
            prevGroup = reversedTail; // 'prevGroup' is now at node 1
            
            if (nextGroupHead == null) {
                // We've reached the end
                break;
            }
        }
        
        return dummy.next;
    }
}