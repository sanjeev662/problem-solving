class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (true) {

            // Check whether k nodes are available
            ListNode temp = curr;

            for (int i = 0; i < k; i++) {
                if (temp == null) {
                    return dummy.next;
                }
                temp = temp.next;
            }

            // Reverse exactly k nodes
            ListNode nextGroup = temp;

            ListNode reversed = reverse(curr, null, nextGroup);

            // Connect previous group
            prev.next = reversed;

            // curr is now the last node of reversed group
            curr.next = nextGroup;

            // Move to next group
            prev = curr;
            curr = nextGroup;
        }
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