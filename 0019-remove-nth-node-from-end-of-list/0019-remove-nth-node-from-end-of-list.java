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
        ListNode curr=head;
        ListNode sizecheck=curr;
        int i=0;
        while(sizecheck!=null){
            i++;
            sizecheck=sizecheck.next;
        }

        int ind=(i-n);
        int j=1;

        if(ind==0){
            return head.next;
        }

        while(curr!=null){
            if(j==ind)
            {
                curr.next=curr.next.next;
                curr=curr.next;
            }else{
                curr=curr.next;
            }
            j++;
        }
        return head;
    }
}