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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;

		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode fast = dummy, slow = dummy;

		int len = 0;
		while (fast.next != null) {
			fast = fast.next;
			len++;
		} // Get the length

		int i = len - k % len;
		while (i > 0) {
			slow = slow.next;
			i--;
		} // Get the i th node

		fast.next = dummy.next;
		dummy.next = slow.next;
		slow.next = null;
		// Do the rotation

		return dummy.next;
    }
}