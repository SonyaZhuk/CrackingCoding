package leetcode.easy.list;

/**
 * {@link <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-list/">83. Remove Duplicates from Sorted List</a>}.
 */
public class RemoveDuplicatesFromSortedList {
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

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode n1 = head;

        while (n1.next != null) {
            if (n1.val == n1.next.val) {
                n1.next = n1.next.next;
            } else n1 = n1.next;

        }

        return head;
    }
}
