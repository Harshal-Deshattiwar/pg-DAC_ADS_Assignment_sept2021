
public class SortedDecendingSList {
	SListNode head;

	public SortedDecendingSList() {
		head = null;
	}

	public void Insert(int element) {
		SListNode newNode = new SListNode(element);
		// if list is empty new node= first node ==head
		if (head == null) {
			head = newNode;
			return;
		}

		SListNode current = head;
		SListNode previous = null;

		// while loop start
		// find the node with data less than current element
		while (current != null) {

			if (current.data < element)
				break;
			previous = current;
			current = current.next;

		} // While loop ends

		// new node is added to as first node and head
		if (current == head) {
			newNode.next = head;
			head = newNode;
			return;
		}
		// new node as last node as element is the smallest
		if (current == null) {
			previous.next = newNode;
			return;
		}

		// element new node in the middle
		previous.next = newNode;
		newNode.next = current;
	}

	public void Delete(int element) throws CustomException {
		SListNode current = head;
		SListNode previous = null;

		if (head == null) {
			current = null;
			previous = null;
		}

		while (current != null) {
			if (current.data == element)
				break;
			previous = current;
			current = current.next;
		}

		if (current == null) {
			throw new CustomException("!!!Element not found!!!!");
		}

		if (current == head) {
			head = head.next;
			return;
		}

		// element found at last node
		if (current.next == null) {
			previous.next = null;
		}

		// element found in between
		previous.next = current.next;
	}

	public boolean Search(int element) {
		SListNode current = head;
		while (current != null) {
			if (current.data == element)
				return true;
			current = current.next;
		}
		return false;
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
