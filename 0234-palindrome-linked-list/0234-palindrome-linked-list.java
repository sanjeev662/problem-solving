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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode leftEnd=head;
        ListNode rightEnd=reverseLinkedList(slow);

        while(leftEnd!=null && rightEnd!=null){
            if(leftEnd.val!=rightEnd.val)
            return false;
            leftEnd=leftEnd.next;
            rightEnd=rightEnd.next;
        }

        return true;
    }

    public ListNode reverseLinkedList(ListNode head){
        ListNode prev=null;
        ListNode curr=head;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}