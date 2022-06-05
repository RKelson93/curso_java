package util;

public class List<T> {
	private ListNode<T> firstNode;
	private ListNode<T> lastNode;
	private String name;
	private Integer position;
	
	public List() {
		this("List");
	}
	
	public List(String name) {
		this.name = name;
		firstNode = lastNode = null;
	}

	public void insertItem(T item) {
		if(is_empty())
			firstNode = lastNode = null;
		else
			firstNode = new ListNode<T>(item, firstNode);
	}
}
