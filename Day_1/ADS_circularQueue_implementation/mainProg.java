

public class mainProg {
	
	public static void add(int element,circularQueueImpl queue) {
		queue.AddQ(element);
		queue.display();
	}
	
//	public static void display(queueImplementation queue) {
//		queue.display();
//	}
//	
	public static void delete(circularQueueImpl queue) {
		queue.DeleteQ();
		queue.display();
	}

	public static void main(String[] args) {
		circularQueueImpl queueObj = new circularQueueImpl(5);

		add(1,queueObj);
		add(2,queueObj);
		add(3,queueObj);
		add(4,queueObj);
		add(5,queueObj);
		add(6,queueObj);
		
		delete(queueObj);
		delete(queueObj);
		delete(queueObj);
		delete(queueObj);
		delete(queueObj);
		delete(queueObj);
		
		add(5,queueObj);
		add(6,queueObj);
		
		delete(queueObj);
		delete(queueObj);
		delete(queueObj);
		
		
	}

}
