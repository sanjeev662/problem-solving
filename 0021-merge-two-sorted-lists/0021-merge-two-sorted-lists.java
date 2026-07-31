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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l1curr=list1;
        ListNode l2curr=list2;

        ListNode ans=new ListNode(-1);
        ListNode newl=ans;

        while(l1curr!=null && l2curr!=null){
            if(l1curr.val<=l2curr.val){
                newl.next=l1curr;
                l1curr=l1curr.next;               
            }else{
                newl.next=l2curr;
                l2curr=l2curr.next;
            }
            newl=newl.next;
        }

        if(l1curr!=null){
            newl.next=l1curr;
        }

        if(l2curr!=null){
            newl.next=l2curr;
        }

        return ans.next;
    }
}