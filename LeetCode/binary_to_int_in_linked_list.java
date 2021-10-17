package LeetCode;

import java.util.Stack;
// Example 1:

// Input: head = [1,0,1]
// Output: 5
// Explanation: (101) in base 2 = (5) in base 10

// Example 2:

// Input: head = [0]
// Output: 0

// Example 3:

// Input: head = [1]
// Output: 1

public class binary_to_int_in_linked_list {

    public class ListNode {
        int val;
        ListNode next;

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

    public int getDecimalValue(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head.next != null) {
            stack.push(head.val);
            head = head.next;
        }
        stack.push(head.val);
        int result = 0;
        int i = 1;
        while (!stack.isEmpty()) {
            result += stack.pop() * i;
            i *= 2;
        }
        return result;

    }
}
