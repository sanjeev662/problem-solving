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

        //for getting length then actual index from left
        int len=0;
        ListNode temp=head;
        while(temp != null){
            temp=temp.next;
            len++;
        }
        int actualInd=len-(k%len);

        if(actualInd==len) return head; //rotated list will same

        ListNode tt = null;
        while(curr!=null && actualInd>0){
            actualInd--;
            if(actualInd == 0){
                tt=curr.next;
                curr.next=null;
                break;
            }
            curr=curr.next;
        }

        ListNode ans=tt;
        while(tt.next!=null){
            tt=tt.next;
        }

        tt.next=head;

        return ans;
    }
}