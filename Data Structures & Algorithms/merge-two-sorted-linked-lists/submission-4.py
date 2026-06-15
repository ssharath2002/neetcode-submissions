# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        a = list1
        b = list2

        dummy = ListNode(0)
        current = dummy

        while a is not None and b is not None:
            if(a.val<=b.val):
                current.next=a
                a=a.next
            else:
                current.next=b
                b=b.next
            
            current=current.next
        
        if a is not None:
            current.next=a
        if b is not None:
            current.next=b
        
        return dummy.next
        
        