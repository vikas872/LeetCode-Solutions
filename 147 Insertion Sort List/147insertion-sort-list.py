class Solution(object):
    def insertionSortList(self, head):
        if not head or not head.next:
            return head

        sorted_list = ListNode(0)
        current = head

        while current:
            prev = sorted_list
            next_node = current.next

            while prev.next and prev.next.val < current.val:
                prev = prev.next

            current.next = prev.next
            prev.next = current
            current = next_node
        return sorted_list.next
