/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA;
        ListNode b=headB;
        ListNode aa=headA;
        ListNode bb=headB;
        int na=0;
        int nb=0;

        while(a!=null)
        {
            a=a.next;
            na++;
        }

        while(b!=null)
        {
            b=b.next;
            nb++;
        }

        int diff=Math.abs(nb-na);

        if(nb>na){
            while(diff>0) {
                diff--;
                bb=bb.next;
            }
        }else{
            while(diff>0) {
                diff--;
                aa=aa.next;
            }
        }

        while(bb!=null && aa!=null){
            if(bb==aa){
                return new ListNode(bb.val);
            }
            bb=bb.next;
            aa=aa.next;
        }
        return null;
    }
}