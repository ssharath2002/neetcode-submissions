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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null) return head;
        
        ListNode temp = head;
        int cnt = 0;
        while(temp!=null){
            temp = temp.next;
            cnt++;
        }
        if(cnt<k) return head;

        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        int count = 0;

        while(current!=null && count<k){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        if(next!=null){
            head.next = reverseKGroup(next, k);
        }
        return prev;
     }
}
