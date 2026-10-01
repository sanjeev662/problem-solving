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
    public void reorderList(ListNode head) {
        ListNode curr=head;
        ListNode fast=head.next;
        ListNode slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        ListNode second=slow.next;
        slow.next=null;

        ListNode opp=reverse(second);

        while(curr!=null && opp!=null){
            ListNode tempstart=curr.next;
            ListNode tempend=opp.next;

            curr.next=opp;
            opp.next=tempstart;

            opp=tempend;
            curr=tempstart;
        }

    }

    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;

        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }

        return prev;
    }
}