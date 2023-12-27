package leetcode.medium.list;

/**
 * {@link <a href="https://leetcode.com/problems/add-two-numbers/">2. Add Two Numbers</a>}.
 */
public class AddTwoNumbers {
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n = new ListNode(0);
        int c = 0;
        ListNode dummy = n;
        while (l1 != null || l2 != null) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            int k = x + y + c;
            c = k / 10;
            dummy.next = new ListNode(k % 10);
            dummy = dummy.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        if (c > 0) {
            dummy.next = new ListNode(c);
        }
        return n.next;
    }

    public ListNode addTwoNumbersI(ListNode l1, ListNode l2) {
        int l1Size = getSize(l1);
        int l2Size = getSize(l2);

        if (l1Size > l2Size) {
            l2 = fullNull(l2, l2Size, l1Size - l2Size);
        }
        if (l1Size < l2Size) {
            l1 = fullNull(l1, l1Size, l2Size - l1Size);
        }

        boolean flag = false;
        ListNode res = null;
        int val = 0;

        while (l1 != null) {
            val = l1.val + l2.val;
            if (flag) val = val + 1;

            if (val >= 10) {
                flag = true;
                l2.val = val % 10;
            } else {
                flag = false;
                l2.val = val;
            }
            res = l2;
            l1 = l1.next;
            l2 = l2.next;

            if (val >= 10) {
                res.next = new ListNode(val / 10, null);
            }
        }

        return l2;
    }

    private ListNode fullNull(ListNode node, int size, int k) {
        ListNode n = null;

        int fullSize = size + k;

        while (fullSize != 0) {
            while (k != 0) {
                n = new ListNode(0, null);
                n = n.next;
                k--;
            }
            n = node;
            n = n.next;
            node = node.next;
        }
        return n;
    }

    private int getSize(ListNode node) {
        int size = 0;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }
}
