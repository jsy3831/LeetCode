class MyHashMap {
    private static class ListNode {
		int key, val;
		ListNode next;

		ListNode(int key, int val, ListNode next) {
			this.key = key;
			this.val = val;
			this.next = next;
		}
	}

	static final int size = 10_000;
	ListNode[] nodes;

	public MyHashMap() {
		this.nodes = new ListNode[size];
	}

	private int hashFuntion(int key) {
		return Integer.hashCode(key) % size;
	}

	public void put(int key, int value) {
		remove(key);
		int index = hashFuntion(key);
		ListNode node = new ListNode(key, value, nodes[index]);
		nodes[index] = node;
	}

	public int get(int key) {
		int index = hashFuntion(key);
		ListNode node = nodes[index];

		for (; node != null; node = node.next) {
			if (node.key == key) return node.val;
		}

		return -1;
	}

	public void remove(int key) {
		int index = hashFuntion(key);
		ListNode node = nodes[index];

		if (node == null) return;

		if (node.key == key) {
			nodes[index] = node.next;
		} else { 
            for (; node.next != null; node = node.next) {
				if (node.next.key == key) {
					node.next = node.next.next;
					return;
				}
			}
		}

	}
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */