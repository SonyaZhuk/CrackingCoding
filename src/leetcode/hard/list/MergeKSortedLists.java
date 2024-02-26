package leetcode.hard.list;

import java.util.PriorityQueue;

/**
 * {@link <a href="https://leetcode.com/problems/merge-k-sorted-lists/">23. Merge k Sorted Lists</a>}.
 */
public class MergeKSortedLists {
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


    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (ListNode list : lists) {
            while (list != null) {
                queue.add(list.val);
                list = list.next;
            }
        }

        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;

        while (!queue.isEmpty()) {
            head.next = new ListNode(queue.poll());
            head = head.next;
        }

        return dummy.next;
    }

    public ListNode mergeKListsI(ListNode[] lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode list : lists) {
            while (list != null) {
                queue.add(list);
                list = list.next;
            }
        }

        ListNode head = queue.poll();
        ListNode temp = head;
        while (!queue.isEmpty()) {
            temp.next = queue.poll();
            temp = temp.next;
        }

        if (temp != null) temp.next = null;

        return head;
    }

    public ListNode mergeKListsII(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        int last = lists.length - 1;

        while (last != 0) {
            int left = 0, right = last;
            while (left < right) {
                lists[left] = mergeTwoLists(lists[left], lists[right]);
                left++;
                right--;
            }
            last = right;
        }

        return lists[0];
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode list = new ListNode(-1);
        ListNode temp = list;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        if (l1 != null) temp.next = l1;
        if (l2 != null) temp.next = l2;

        return list.next;
    }
}
