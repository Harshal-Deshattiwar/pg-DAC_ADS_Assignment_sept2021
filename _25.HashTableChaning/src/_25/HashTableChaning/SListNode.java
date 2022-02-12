package _25.HashTableChaning;
public class SListNode {
	private int key;
	private SListNode next;

	public SListNode(int key) {
		this.key = key;
		next = null;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	

	public SListNode getNext() {
		return next;
	}

	public void setNext(SListNode next) {
		this.next = next;
	}
}
