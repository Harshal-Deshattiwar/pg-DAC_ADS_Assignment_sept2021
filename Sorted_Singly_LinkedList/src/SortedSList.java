public class SortedSList {
	SListNode head;

	public SortedSList() {
		head = null;
	}

	public void Insert(int element) {
		// Make space for new element, say newNode.
		// Store element in newNode's data.
		// Set newNode's next to empty.
		SListNode newNode = new SListNode(element);

		// if (list is empty) then
		if (head == null) {
			// Set newNode as head.
			head = newNode;
			
			// Stop.
			return;
		}

		// Set current to head.
		SListNode current = head;
		// Set previous to empty.
		SListNode previous = null;

		// while (current is not empty) do
		while (current != null) {
			// if (current's data > element) then
			if (current.data > element) {
				// end the traversal/loop
				break;
			}
			// Set previous to current.
			previous = current;
			// Set current to currrent's next.
			current = current.next;
		}

		// Adding before first node?
		// if (current is first node) then
		if (current == head) {
			// Set newNode's next to head.
			newNode.next = head;
			// Set head to newNode
			head = newNode;
			// Stop
			return;
		}

		// Adding after last node?
		// if (current is empty) then
		if (current == null) {
			// Set previous next to newNode.
			previous.next = newNode;
			// Stop.
			return;
		}

		// Insert newNode between previous and current.
		// Set previous next to newNode.
		previous.next = newNode;
		// Set newNode's next to current.
		newNode.next = current;
	}
	
	public void DeleteAll(int element) throws CustomException {
		SListNode current = head;
		SListNode previous = null;
		int foundElement = 0;// will be zero if the element not occurred once
		while (current != null) {
			if (current.data == element) {
				// if element is found in head
				if (head.data == element) {
					head = current.next;
					foundElement++;
				}

				// if element is in the last
				else if (current.next == null) {
					previous.next = null;
					foundElement++;

				}
				// if element is in middle
				else if (current.data == element) {
					
					previous.next = current.next;
					current = previous;
					foundElement++;
				}
			}

			previous = current;
			current = current.next;
		}
		// throws error if element is not in the list
		if (foundElement == 0)
			throw new CustomException("!!Element not found!!");
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
