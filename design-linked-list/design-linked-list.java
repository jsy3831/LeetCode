class MyLinkedList {

    class Node {
		Node next = null;
		int val = 0;

		public Node(int val) {
			this.val =  val;
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

	public int get(int index) {
		if (index < 0 || index >= this.size) return -1;

		Node curr = this.head;
		while (index-- > 0) {
			curr = curr.next; // 헤드노드에서부터 하나씩 순회해야함, O(N)
		}
		return curr.val;
	}

	public Node getNodeAt(int index) {
		Node curr = this.head;
		while (index-- > 0) {
			curr = curr.next;
		}
		return curr;
	}

	public void addAtHead(int val) {
		Node node = new Node(val);
		if (this.size == 0) {
			this.head = node;
			this.tail = node;
		} else {
			node.next = this.head; // 새노드에 현재 헤드노드 연결
			this.head = node; // 헤드노드에 새노드 할당
		}
		this.size++;
	}

	public void addAtTail(int val) {
		Node node = new Node(val);
		if (this.size == 0) {
			this.head = node;
			this.tail = node;
		} else {
			this.tail.next = node; // 현재 테일노드에 새노드 연결
			node.next = null; // 어차피 null로 초기화돼있는데 여기서 또 해줘야하나..?
			this.tail = node; // 테일노드에 새노드 할당
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
			Node prev = getNodeAt(index-1);
			Node forw = prev.next;

			Node curr = new Node(val);
			prev.next = curr;
			curr.next = forw;

			this.size++;
		}

	}

	public void deleteHead() {
		if (this.size == 0) return;
		else if (this.size == 1) {
			this.head = null;
			this.tail = null;
		} else {
			Node curr = this.head;
			Node forw = curr.next;
			curr.next = null;
			this.head = forw;
		}

		this.size--;
	}

	public void deleteTail() {
		if (this.size == 0) return;
		else if (this.size == 1) {
			this.head = null;
			this.tail = null;
		} else {
			Node secondLast = getNodeAt(this.size-2);
			secondLast.next = null;
			this.tail = secondLast;
		}
		this.size--;
	}

	public void deleteAtIndex(int index) {
		if (index < 0 || index >= this.size) return;

		if (index == 0) {
			deleteHead();
		} else if (index == this.size-1) {
			deleteTail();
		} else {
			Node prev = getNodeAt(index-1);
			Node curr = prev.next;
			Node forw = prev.next.next;
			prev.next = forw;
			curr.next = null;
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