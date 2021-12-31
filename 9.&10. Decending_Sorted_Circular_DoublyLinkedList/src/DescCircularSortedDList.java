 public class DescCircularSortedDList {
	DListNode head;

	public DescCircularSortedDList() {
		
		head = new DListNode(-1);
		// Set next and previous of head to itself.
		head.next = head;
		head.previous = head;
	}

	public void Insert(int element) {
		DListNode newNode = new DListNode(element);

		DListNode current = head.next;
		// while (current is not head) do
		while (current != head) {
			// if (current node's data > element) then
			if (current.data < element) {
				// end the loop
				break;
			}
			// Set current to current's next.
			current = current.next;
		}

		newNode.previous = current.previous;
		// Set current as next of newNode
		newNode.next = current;
		// Set next of current's previous node, to newNode
		current.previous.next = newNode;
		// Set newNode as previous of current
		current.previous = newNode;
		// Stop.
	}
	
	public boolean Search(int element) {
		DListNode current = head.next;
		while(current !=head) {
			if(current.data == element)
				return true;
			current=current.next;
		}
		return false;
	}
	
	public void Delete(int element) throws CustomException {
		
		if(head.next==null || head.previous==null)  //not working
			throw new CustomException("!!!List is Empty");
		
		DListNode current = head.next;
		
		while(current != head) {
			if(current.data == element)
				break;
			current = current.next;
		}
		if(current==head)
			throw new CustomException("!!!Element not found");
		if(current== head.next) {
			current.next.previous=head;
			head.next= current.next;
		}
		if(current.next==head) {
			current.previous.next=head;
			head.previous=current.previous;
		}
		current.previous.next = current.next;
		current.next.previous=current.previous;
	}
	public void DeleteAll(int element) throws CustomException {
		if(head.next==null || head.previous==null) //not working
			throw new CustomException("!!!List is empty");
		DListNode current = head.next;
		int elementFound =0;
		while(current != head) {
			if(current.data==element) {
				Delete(element);
				++elementFound;
				}
			current = current.next;
		}
		if(elementFound==0)
			throw new CustomException("!!! element not found");
		
	}
	public int getCount() {
		int count = 0;
		DListNode current;

		current = head.next;
		while (current != head) {
			++count;
			current = current.next;
		}

		return count;
	}

	public int[] getElements() {
		int elements[] = new int[getCount()];
		int i = 0;
		DListNode current;

		current = head.next;
		while (current != head) {
			elements[i] = current.data;
			++i;
			current = current.next;
		}
		return elements;
	}

	public int[] getElementsInReverse() {
		int elements[] = new int[getCount()];
		int i = 0;
		DListNode current;

		current = head.previous;
		while (current != head) {
			elements[i] = current.data;
			++i;
			current = current.previous;
		}
		return elements;
	}
}
