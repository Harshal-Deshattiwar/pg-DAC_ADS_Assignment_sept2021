
public class mainProgQueue {
	
	
	public static void add(int element,queueUsingArray queue) {
		queue.AddQ(element);
		queue.display();
	}
	
	public static void display(queueUsingArray queue) {
		queue.display();
	}
	
	public static void delete(queueUsingArray queue) {
		queue.DeleteQ();
		queue.display();
	}

	public static void main(String[] args) {
		
		queueUsingArray queueObj = new queueUsingArray(5);
		
		add(10,queueObj);
		add(9,queueObj);
		add(8,queueObj);
		add(7,queueObj);
		add(6,queueObj);
		add(5,queueObj);
		
		delete(queueObj);
		delete(queueObj);
		display(queueObj);
		delete(queueObj);
		delete(queueObj);
		delete(queueObj);
		delete(queueObj);
		
	}

}
