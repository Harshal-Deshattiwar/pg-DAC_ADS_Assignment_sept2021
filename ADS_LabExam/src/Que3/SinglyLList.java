package Que3;

public class SinglyLList implements SLLInf{
	
	private SLLNode head;
	private SLLNode tail;
	
	public SinglyLList() {
		head=null;
		tail=null;
	}
	
	@Override
	public void insertAtEnd(int num) {
		//new to store the num
		SLLNode newNode;
		newNode = new SLLNode(num);
		
		//if head is empty then the list is empty
		//so set head and tail to num
		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}

		//if list is not empty
		//set last elements ie. tail's next to newNode  
		tail.next = newNode;
		//and tail to newNode
		tail = newNode;
		
	}

	@Override
	public void deleteFirst() throws CustomException {
		//check if head is empty
		//if empty then exit
		if(head==null) {
			throw new CustomException("List is empty");
		}
		//if list is not empty
		//then set head to next node
		head=head.next;//Garbage collector will remove non mark node in list
		
		//if head is equal to tails then the last element is the only element of the list
		//so set tail to null;
		if(head==tail)
			tail=null;
	}
	
	//method to get count of nodes in the list
	public int getCount() {
		int count = 0;//counter
		SLLNode current;

		current = head;
		while (current != null) {
			++count;
			current = current.next;
		}

		return count;
	}
	
	public int[] getElements() {
		//create a new array to store elements of list
		int elements[] = new int[getCount()];
		int i = 0;
		
		SLLNode current;//current to traverse to the list

		current = head;
		while (current != null) {
			elements[i] = current.data;//store the element in the list
			++i;
			current = current.next;
		}
		return elements;
	}

}
