
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

		//newNode.data = element;
		//newNode.next = null;

		if (head == null) {
			head = newNode;
			tail = newNode;//fixed at the first node when the list was empty
			return;
		}

		newNode.next = head;//next  of the newnode will contain the node store in head 
		head = newNode;//now the head is assign to newNode
	}

	public void AddAtRear(int element) {
		// Make space for new element, newNode.
		SListNode newNode;
		newNode = new SListNode(element);

		// Store element in newNode's data
		//newNode.data = element;
		// Set newNode's next to empty
		//newNode.next = null;

		// if (list is empty) then
		if (head == null) {
			// Set head and tail to newNode
			head = newNode;
			tail = newNode;
			// Stop
			return;
		}

		// Set tail's next to newNode
		tail.next = newNode;
		// Set tail to newNode
		tail = newNode;
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
