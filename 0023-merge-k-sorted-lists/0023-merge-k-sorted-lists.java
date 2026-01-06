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
    public ListNode mergeKLists(ListNode[] lists) {
        return splitMerge(0,lists.length-1,lists);
    }

    public ListNode splitMerge(int start,int end, ListNode[] lists){
        if(start==end) return lists[start];
        if(start>end) return null;

        int mid=start+(end-start)/2;

        ListNode L1=splitMerge(start,mid,lists);
        ListNode L2=splitMerge(mid+1,end,lists);

        return mergeTwoSortedList(L1,L2);
    }

    public ListNode mergeTwoSortedList(ListNode list1, ListNode list2){
        if(list1==null) return list2;
        if(list2==null) return list1;

        if(list1.val>list2.val){
            list2.next=mergeTwoSortedList(list1,list2.next);
            return list2;
        }else{
            list1.next=mergeTwoSortedList(list2,list1.next);
            return list1;
        }
    }
}