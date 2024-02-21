package leetcode.medium.list;

/**
 * {@link <a href="https://leetcode.com/problems/remove-nth-node-from-end-of-list/">19. Remove Nth Node From End of List</a>}.
 */
public class RemoveNthNodeFromEndOfList {
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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode node = head;

        while (node != null) {
            size++;
            node = node.next;
        }

        if (size == 1 || size - n < 0) return null;
        if (size == n) return head.next;

        int num = size - n - 1;
        node = head;

        while (num > 0) {
            node = node.next;
            num--;
        }

        node.next = node.next.next;

        return head;
    }

    public ListNode removeNthFromEndI(ListNode head, int n) {
        ListNode node = new ListNode();
        node.next = head;
        ListNode left = node;
        ListNode right = node;

        for (int i = 0; i < n; i++) {
            right = right.next;
        }
        while (right.next != null) {
            left = left.next;
            right = right.next;
        }

        left.next = left.next.next;
        return node.next;
    }
}
