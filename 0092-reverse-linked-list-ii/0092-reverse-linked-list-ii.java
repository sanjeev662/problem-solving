class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode tempstart = dummy;

        // Find node before left
        for (int i = 1; i < left; i++) {
            tempstart = tempstart.next;
        }

        ListNode start = tempstart.next;

        // Find right
        ListNode end = start;
        for (int i = left; i < right; i++) {
            end = end.next;
        }

        // IMPORTANT: save this before changing pointers
        ListNode afterEnd = end.next;

        ListNode reversed = reverse(start, null, afterEnd);

        tempstart.next = reversed;
        start.next = afterEnd;

        return dummy.next;
    }

    public ListNode reverse(ListNode start, ListNode prev, ListNode end) {

        ListNode curr = start;

        while (curr != end) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}