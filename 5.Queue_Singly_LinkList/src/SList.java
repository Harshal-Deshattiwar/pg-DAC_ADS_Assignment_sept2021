
public class SList {
	SListNode head;
	SListNode tail;

	public SList() {
		head = null;
		tail = null;
	}

	public void AddAtFront(int element) {
		SListNode newNode;
		newNode = new SListNode(element);


		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;
	}

	public void AddAtRear(int element) {
		
		SListNode newNode;
		newNode = new SListNode(element);

		if (head == null) {
			
			head = newNode;
			tail = newNode;
			return;
		}


		tail.next = newNode;
		
		tail = newNode;
	}
	
	public SListNode getHead() {
		return head;
	}

	public int DeleteFirstNode() {
		if(head==null) {
			return 0 ;
		}
		SListNode temp=head;
		head=head.next;
		if(head==tail)
			tail=null;
		return temp.data;
	}
	
	public int DeleteLastNode() {
		SListNode temp;
		if(head==null)
			return 0;
		if(head==tail || head.next==null) {
			temp=head;
			head=tail=null;
			return temp.data;
		}
		
		SListNode current;
		current=head;
		while(current.next != tail) {
			current=current.next;
		}
		current.next=null;
		temp =tail;
		tail=current;
		return temp.data;
		
	}

	public int getCount() {
		int count = 0;
		SListNode current;

		current = head;
		while (current != null) {
			++count;
			current = current.next;
		}

		return count;
	}

	public int[] getElements() {
		int elements[] = new int[getCount()];
		int i = 0;
		SListNode current;

		current = head;
		while (current != null) {
			elements[i] = current.data;
			++i;
			current = current.next;
		}
		return elements;
	}
}
