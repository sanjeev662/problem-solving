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
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode tempStart=dummy;

        for(int i=1;i<left;i++){
            tempStart=tempStart.next;
        }

        ListNode start=tempStart.next;

        ListNode end = start;
        for(int i=left;i<right;i++){
            end=end.next;
        }

        ListNode afterEnd = end.next;


        ListNode reversed=reverse(start,null,afterEnd);

        tempStart.next=reversed;
        start.next=afterEnd;

        return dummy.next;
    }

    public ListNode reverse(ListNode start, ListNode prev, ListNode end){
        ListNode curr=start;
        while(curr!=end){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }

        return prev;
    }
}