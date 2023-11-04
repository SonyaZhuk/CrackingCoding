package leetcode.medium.list;

/**
 * {@link <a href="https://leetcode.com/problems/add-two-numbers/">2. Add Two Numbers</a>}.
 */
public class AddTwoNumbers {
      private static class ListNode {
          int val;
          ListNode next;

          ListNode() {}

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
}
