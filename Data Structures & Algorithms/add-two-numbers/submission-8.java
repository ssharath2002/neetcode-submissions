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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy= new ListNode(0);
        ListNode p=l1;
        ListNode q=l2;
        ListNode curr=dummy;
        int carry=0;
        while(p!=null || q!=null){
            int a=(p!=null)? p.val:0;
            int b=(q!=null)? q.val:0;
            int sum= carry+a+b;

            carry=sum/10;
            curr.next =new ListNode(sum%10);
            curr=curr.next;

            p=(p!=null)? p.next:null;
            q=(q!=null)? q.next:null;
            if(carry>0){
                curr.next = new ListNode(sum/10);
            }
        }
        return dummy.next;
    }
}
