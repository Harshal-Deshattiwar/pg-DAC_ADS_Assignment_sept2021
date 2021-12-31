
public class DecsSortedLinkedList {
	DListNode head;
	DListNode tail;
	
	public void Insert(int element) {
		DListNode newNode = new DListNode(element);
		
		if(head==null) {
			head=newNode;
			tail=newNode;
			return;
		}
		DListNode current = head;
		
		while(current != null) {
			if(current.data<element) {
				break;
			}
		current = current.next;
		}
		if(current==head) {
			newNode.next= head;
			current.previous=newNode;
			head=newNode;
			return;
		}
		
		if(current==null) {
			tail.next=newNode;
			newNode.previous=tail;
			tail=newNode;
			return;
		}
		
		
		newNode.previous=current.previous;
		newNode.next=current;
		current.previous.next=newNode;
		current.previous=newNode;
	}
	
	public void Delete(int element) {
		DListNode current = head;
		
		if(current== null) {
			current=null;
		}
		while(current != null) {
			if(current.data==element)
				break;
			current= current.next;
		}
		
		if(current==null) {
			return;
		}
		
		if(current == head) {
			head=current.next;
			return;
		}
		
		if(current.next==tail) {
			tail=current.previous;
			current.previous.next=null;
			return;
		}
		
		
		current.previous.next=current.next;
		
	}
	
	public boolean Search(int element) {
		if(head== null)
			return false;
		DListNode current = head;
		while(current!=null) {
			if(current.data==element)
				return true;
			current=current.next;
		}
		return false;
	}
	
	public int getCount() {
		DListNode current = head;
		int count=0;
		while(current != null) {
			++count;
			current=current.next;
			}
		return count;
	}
	
	public int[] getElement() {
		int[] elements= new int[getCount()];
		DListNode current = head;
		int i = 0;
		while(current!=null) {
			elements[i] = current.data;
			++i;
			current=current.next;
		}
		return elements;
	}
}
