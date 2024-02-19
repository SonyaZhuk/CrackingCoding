package leetcode.medium.list;

/**
 * {@link <a href="https://leetcode.com/problems/insertion-sort-list/">147. Insertion Sort List</a>}.
 */
public class InsertionSortList {
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

    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            if (curr.val > prev.val) {
                prev = curr;
                curr = curr.next;
            } else {
                ListNode temp = dummy;
                while (temp.next.val < curr.val) {
                    temp = temp.next;
                }

                prev.next = curr.next;
                curr.next = temp.next;
                temp.next = curr;
                curr = prev.next;
            }
        }

        return dummy.next;
    }
}
