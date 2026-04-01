/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var detectCycle = function(head) {
    let slow=head;
    let fast=head;

    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;

        if(slow==fast){
            let firstNode=head;

            while(firstNode!=slow){
                firstNode=firstNode.next;
                slow=slow.next;
            }
            return firstNode;
        }
    }

    return null;
};