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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        ListNode curr=head;
        ListNode newhead=head;
        ListNode len=head;

        int n=0;
        while(len!=null){
            len=len.next;
            n++;
        }

        if(k%n==0) return head;

        int nn=n-(k%n);

        while(curr!=null){
            nn--;
            ListNode temp=null;
            if(nn==0){
                newhead=curr.next;
                curr.next=null;
                ListNode tt=newhead;
                while(tt!=null && tt.next!=null){
                    tt=tt.next;
                }
                tt.next=head;
            }
            curr=curr.next;
        }

        return newhead;
    }
}