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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }

        int nn=(length-n-1);

        if(length==n)
        return head.next;

        ListNode curr=head;
        while(nn>0){
            curr=curr.next;
            nn--;
        }

        if(curr!=null && curr.next!=null)
        curr.next=curr.next.next;
        else
        curr.next=null;

        return head;
    }
}