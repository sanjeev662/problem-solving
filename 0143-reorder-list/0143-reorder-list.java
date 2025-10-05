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
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode rHalf=reverseList(slow.next);
        slow.next = null;

        while(rHalf!=null){
            ListNode temp=curr.next;
            ListNode tempr=rHalf.next;

            curr.next=rHalf;
            rHalf.next=temp;

            rHalf=tempr;
            curr=temp;
        }

    }

    private ListNode reverseList(ListNode head){
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