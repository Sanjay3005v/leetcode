//141. Linked List Cycle


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
var hasCycle = function (head) {
    if (head == null || head.next == null) {
        return false;
    }
    let fast, slow;
    fast = head.next.next;
    slow = head.next;
    while (fast != null && fast.next != null && fast != slow) {
        fast = fast.next.next;
        slow = slow.next;
    }
    return slow == fast;
};
