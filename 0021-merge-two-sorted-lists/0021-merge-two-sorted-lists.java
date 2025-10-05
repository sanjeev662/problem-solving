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
        ListNode resHead=new ListNode(-1);
        ListNode tail=resHead;
        while(list1!=null && list2!=null){
            int list1val=list1.val;
            int list2val=list2.val;
            if(list1val>=list2val){
                tail.next=list2;
                list2=list2.next;
            }else{
                tail.next=list1;
                list1=list1.next;
            }
            tail=tail.next;
        }
        if(list1!=null) tail.next=list1;
        if(list2!=null) tail.next=list2;

        return resHead.next;
    }
}