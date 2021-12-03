package MiddleOfLinkedList;

class Solution {

    class ListNode {
        int val;
        ListNode

        next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode middleNode(ListNode head) {
        ListNode n = head;
        int size = 1;
        while (n.next != null) {
            n = n.next;
            size++;
        }
        size /= 2;
        while (size-- > 0)
            head = head.next;
        return head;
    }
}
