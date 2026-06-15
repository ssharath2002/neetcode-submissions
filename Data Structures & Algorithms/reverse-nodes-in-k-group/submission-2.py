# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseKGroup(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        if head is None:
            return head

        temp = head
        cnt = 0
        while temp is not None:
            cnt+=1
            temp = temp.next

        if cnt<k:
            return head
        
        prev = None
        current = head
        next = None
        count = 0

        while current is not None and count<k:
            next = current.next
            current.next = prev
            prev =current
            current = next
            count+=1
        
        if next is not None:
            head.next = self.reverseKGroup(next, k)

        return prev
        
        