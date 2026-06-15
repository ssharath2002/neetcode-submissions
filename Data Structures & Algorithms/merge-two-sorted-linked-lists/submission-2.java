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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode a = list1;
        ListNode b = list2;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while(a!=null && b!=null){
            if(a.val<=b.val){
                current.next=a;
                a=a.next;
            }
            else{
                current.next=b;
                b=b.next;
            }
            current=current.next;
        }
        if(a!=null){
            current.next=a;
        }
        if(b!=null){
            current.next=b;
        } 
        return dummy.next;
    }
}