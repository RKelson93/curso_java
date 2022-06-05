package util;

class ListNode<T> {
	T data;
	ListNode<T> next;

	ListNode(T object) {
		this(object, null);
	}

	ListNode(T object, ListNode<T> nextNode) {
		data = object;
		next = nextNode;
	}

	T getData() {
		return data;
	}

	ListNode<T> getNextNode() {
		return nextNode;
	}
}
