//21. Merge Two Sorted Lists


/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} list1
 * @param {ListNode} list2
 * @return {ListNode}
 */
var mergeTwoLists = function (list1, list2) {
    let head = new ListNode();
    let temp = head;

    while (list1 != null && list2 != null) {
        if (list1.val > list2.val) {
            temp.next = list2;
            temp = temp.next;
            list2 = list2.next;
        }
        else {
            temp.next = list1;
            temp = temp.next;
            list1 = list1.next;
        }
    }
    if (list1 == null) {
        temp.next = list2;
    }
    else {
        temp.next = list1;
    }
    return head.next;
};
