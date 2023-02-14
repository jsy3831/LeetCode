class MyLinkedList {

    static class Node {
		Node next = null;
		Node prev = null; // double linked list
		int val = 0;

		public Node(int val) {
			this.val = val;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public int getSize() {
		return this.size;
	}

	public int get(int index) {
		if (index < 0 || index >= this.size) return -1;

		Node cur = this.head;
		while (index > 0) {
			cur = cur.next;
			index--;
		}

		return  cur.val;
	}

	public Node getNode(int index) {
		if (index < 0 || index >= this.size) return null;

		Node cur = this.head;
		while (index > 0) {
			cur = cur.next;
			index--;
		}

		return cur;
	}

	public void addAtHead(int val) {
		Node cur = new Node(val);

		if (this.size == 0) {
			this.head = cur;
			this.tail = cur;
		} else {
			cur.next = this.head;
			this.head.prev = cur; // 기존 헤드노드의 prev에 새노드 연결
			this.head = cur;
		}

		this.size++;
	}

	public void addAtTail(int val) {
		Node cur = new Node(val);

		if (this.size == 0) {
			this.head = cur;
			this.tail = cur;
		} else {
			cur.prev = this.tail; // 새노드의 prev에 기존 테일노드 연결
			this.tail.next = cur;
			this.tail = cur;
		}

		this.size++;
	}

	public void addAtIndex(int index, int val) {
		if (index < 0 || index > this.size) return;

		if (index == 0) {
			addAtHead(val);
		} else if (index == this.size) {
			addAtTail(val);
		} else {
			Node next = getNode(index);
			Node prev = next.prev;

			Node curr = new Node(val);
			curr.prev = prev;
			curr.next = next;
			// link cur with prev and next.

			prev.next = curr;
			next.prev = curr;
			// re-link prev and next with cur.

			this.size++;
		}
	}

	public void deleteAtHead() {
		if (this.size == 0) {
			return;
		} else if (this.size == 1) {
			this.head = null;
			this.tail = null;
		} else {
			Node cur = this.head;
			Node next = cur.next;

			cur.next = null;
			next.prev = null;
			this.head = next;
		}

		this.size--;
	}

	public void deleteAtTail() {
		if (this.size == 0) {
			return;
		} else if (this.size == 1) {
			this.head = null;
			this.tail = null;
		} else {
			Node tail = getNode(this.size-1);
			Node secondLast = tail.prev;
			secondLast.next = null;
			this.tail = secondLast;
		}

		this.size--;
	}

	public void deleteAtIndex(int index) {
		if (index < 0 || index >= this.size) return;

		if (index == 0) {
			deleteAtHead();
		} else if (index == this.size-1) {
			deleteAtTail();
		} else {
			Node cur = getNode(index);
			Node prev = cur.prev;
			Node next = cur.next;

			prev.next = next;
			next.prev = prev;

			cur.next = null;
			cur.prev = null;

			this.size--;
		}
	}
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */