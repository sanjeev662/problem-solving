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

        while(l1!=null && l2!=null){
            int sum=l1.val+l2.val+extra;
            extra=sum/10;
            int val=sum%10;

            ListNode temp=new ListNode(val);
            curr.next=temp;
            curr=curr.next;

            l1=l1.next;
            l2=l2.next;
        }

        while(l1!=null){
            int sum=l1.val+extra;
            extra=sum/10;
            int val=sum%10;

            ListNode temp=new ListNode(val);
            curr.next=temp;
            curr=curr.next;

            l1=l1.next;
        }

        while(l2!=null){
            int sum=l2.val+extra;
            extra=sum/10;
            int val=sum%10;

            ListNode temp=new ListNode(val);
            curr.next=temp;
            curr=curr.next;

            l2=l2.next;
        }

        if(extra>0){
            ListNode temp=new ListNode(extra);
            curr.next=temp;
            curr=curr.next;
        }

        return asum.next;
    }
}