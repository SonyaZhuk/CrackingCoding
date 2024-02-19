package leetcode.medium.list;

import java.util.PriorityQueue;

/**
 * {@link <a href="https://leetcode.com/problems/sort-list/">148. Sort List</a>}.
 */
public class SortList {
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

    public ListNode sortList(ListNode head) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        ListNode node = head;
        while (node != null) {
            queue.add(node.val);
            node = node.next;
        }

        node = head;

        while (node != null && !queue.isEmpty()) {
            node.val = queue.poll();
            node = node.next;
        }

        return head;
    }
}