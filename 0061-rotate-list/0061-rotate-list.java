// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode rotateRight(ListNode head, int k) {
//         if(head==null || head.next==null || k==0) return head;
//         ListNode curr=head;

//         //for getting length then actual index from left
//         int len=0;
//         ListNode temp=head;
//         while(temp != null){
//             temp=temp.next;
//             len++;
//         }
//         int actualInd=len-(k%len);

//         if(actualInd==len) return head; //rotated list will same

//         ListNode tt = null;
//         while(curr!=null && actualInd>0){
//             actualInd--;
//             if(actualInd == 0){
//                 tt=curr.next;
//                 curr.next=null;
//                 break;
//             }
//             curr=curr.next;
//         }

//         ListNode ans=tt;
//         while(tt.next!=null){
//             tt=tt.next;
//         }

//         tt.next=head;

//         return ans;
//     }
// }

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        // Step 1: find length and tail
        int len = 1;
        ListNode tail = head;

        while (tail.next != null) {
            tail = tail.next;
            len++;
        }

        // Step 2: normalize k
        k = k % len;
        if (k == 0) return head;

        // Step 3: find new tail (len - k - 1 steps from head)
        int stepsToNewTail = len - k;
        ListNode curr = head;

        for (int i = 1; i < stepsToNewTail; i++) {
            curr = curr.next;
        }

        // Step 4: rotate
        ListNode newHead = curr.next;
        curr.next = null;
        tail.next = head;

        return newHead;
    }
}

// I first compute the length and tail, normalize k, find the new tail at position len - k, break the list there, and reconnect the old tail to the original head.

