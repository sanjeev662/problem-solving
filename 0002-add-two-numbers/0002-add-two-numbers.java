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
        ListNode asum=new ListNode(-1);
        ListNode curr=asum;
        int extra=0;

        while(l1!=null || l2!=null || extra>0){

            int val1=(l1!=null) ? l1.val : 0;
            int val2=(l2!=null) ? l2.val : 0;

            int sum = val1+val2+extra;
            extra=sum/10;
            int val=sum%10;

            ListNode temp=new ListNode(val);
            curr.next=temp;
            curr=curr.next;

            if(l1!=null)
            l1=l1.next;
            if(l2!=null)
            l2=l2.next;
        }

        return asum.next;
    }
}