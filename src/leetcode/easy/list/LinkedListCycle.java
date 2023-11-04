package leetcode.easy.list;

import java.util.HashSet;
import java.util.Set;

/**
 * {@link <a href="https://leetcode.com/problems/linked-list-cycle/">141. Linked List Cycle</a>}.
 */
public class LinkedListCycle {
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode l1 = head;
        ListNode l2 = head;

        while(l2 != null && l2.next != null) {
            l1 = l1.next;
            l2 = l2.next.next;

            if (l1 == l2) return true;
        }

        return false;
    }

    public boolean hasCycleI(ListNode head) {
        Set<ListNode> set = new HashSet<>();

        while(head != null) {

            if (set.contains(head)) return true;

            set.add(head);
            head = head.next;
        }
        return false;
    }
}
