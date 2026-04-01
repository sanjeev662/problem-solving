/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {boolean}
 */
var hasCycle = function(head) {
    if(head==null) return false;
    let slow=head;
    let fast=head.next;

    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;

        if(fast==slow) return true;
    }
    return false;
};