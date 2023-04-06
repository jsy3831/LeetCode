class MinStack {
    private Node head;

	public MinStack() {
	}

	public void push(int val) {
		if (head == null)
			head = new Node(val, val, null);
		else
			head = new Node(val, Math.min(val, head.min), head);
	}

	public void pop() {
		if (head != null)
			head = head.next;
	}

	public int top() {
		if (head != null)
			return head.val;

		return -1;
	}

	public int getMin() {
		if (head != null)
			return head.min;

		return -1;
	}

	/**
	 * inner class(멤버 클래스)에 static을 붙이는 이유
	 * 1. 사용성 증대 : 정적 멤버 클래스는 바깥 클래스의 인스턴스에 바인딩되지 않기 때문에
	 * 				바깥 클래스의 인스턴스가 존재하지 않아도 inner class를 사용할 수 있다.
	 * 2. 메모리 누수 방지 : non-static inner class는 바깥 클래스의 인스턴스를 참조하므로
	 * 					멤버 클래스의 인스턴스가 바깥 클래스의 인스턴스보다 오래 살아남을 경우 바깥 클래스의 인스턴스도                         메모리에서 해제 되지않아서,
	 * 					즉 가바지 컬렉션이 바깥 클래스의 인스턴스를 수거하지 못하여 메모리 누수가 발생할 수 있다.
	 **/
	private static class Node {
		int val;
		int min;
		Node next;

		private Node(int val, int min, Node next) {
			this.val  = val;
			this.min = min;
			this.next = next;
		}
	}
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */