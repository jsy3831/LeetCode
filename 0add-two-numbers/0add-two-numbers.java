/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
		else if (l2 == null) return l1;

		ListNode dummy = new ListNode(0);
		ListNode cur = dummy;

		boolean ceil = false;

		while (l1 != null || l2 != null) {
			int sum = 0;

			if (l1 != null && l2 != null) {
				sum = l1.val + l2.val;
				l1 = l1.next;
				l2 = l2.next;
			} else if (l1 == null) {
				sum = l2.val;
				l2 = l2.next;
			} else {
				sum = l1.val;
				l1 = l1.next;
			}

			if (ceil) {
				sum += 1;
				ceil = false;
			}

			if (sum >= 10) {
				ceil = true;
				sum -= 10;
			}

			cur.next = new ListNode(sum);
			cur = cur.next;
		}

		if (ceil) cur.next = new ListNode(1);

		return dummy.next;
    }
}