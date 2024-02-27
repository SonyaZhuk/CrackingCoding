package leetcode.medium.list;

/**
 * {@link <a href="https://leetcode.com/problems/rotate-list/">61. Rotate List</a>}.
 */
public class RotateList {
    private static class ListNode {
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

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) return head;

        int size = 1;
        ListNode node = head;

        while (node.next != null) {
            size++;
            node = node.next;
        }

        node.next = head;

        int step = size - (k % size);

        while (step > 0) {
            node = node.next;
            step--;
        }

        ListNode newHead = node.next;
        node.next = null;

        return newHead;
    }
}
