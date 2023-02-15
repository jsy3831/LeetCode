/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node cur = head;

		while (cur != null) {
			if (cur.child != null) {
				Node tail = findTail(cur.child);

				if (cur.next != null) cur.next.prev = tail;

				tail.next = cur.next;
				cur.next = cur.child;
				cur.child.prev = cur;
				cur.child = null;
			}

			cur = cur.next;
		}

		return head;
    }
    
    public Node findTail(Node child) {
		while (child.next != null) {
			child = child.next;
		}

		return child;
	}
}