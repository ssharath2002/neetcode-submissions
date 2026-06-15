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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode leftPrev = dummy;
        for(int i=0; i<left-1; i++){
            leftPrev=leftPrev.next;
        }
       
        ListNode prev= null;
        ListNode current= leftPrev.next;
        for(int i=0; i<right-left+1; i++){
            ListNode tempNext = current.next;
            current.next = prev; 
            prev= current;
            current = tempNext;
        }
        leftPrev.next.next=current;
        leftPrev.next= prev;
        return dummy.next;
    }
}