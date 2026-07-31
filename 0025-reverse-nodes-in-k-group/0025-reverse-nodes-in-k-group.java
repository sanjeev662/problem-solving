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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr=head;
        return reverse(curr,k);  
    }

    public ListNode reverse(ListNode head,int k){
        ListNode curr=head;
        ListNode prev=null;
        int kk=k;

        ListNode countNode=head;
        int count=0;

        while(countNode!=null){
            countNode=countNode.next;
            count++;
        }

        if(count<k) return head;

        while(kk>0){
            kk--;
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }

        if(curr!=null){
            head.next=reverse(curr,k); 
        }

        return prev;
    }
}