

public class queueUsingArray implements queueInf{
	int front,rear;
	int queue [];
	int n;
	
	
	
	public queueUsingArray(int n) {
		this.n= n;
		this.front = -1;
		this.rear = -1;
		this.queue = new int[n];
	}

	@Override
	public void AddQ(int element) {
		if (IsFull()) {
			System.out.println("**********************");
			System.out.println("Stack is full");
			System.out.println("**********************");

			return;
		}
		else {
			++rear;
			queue[rear] = element;
			System.out.println("Added : " + queue[rear]);
		}
	}

	@Override
	public int DeleteQ() {
		
		if(IsEmpty()) {
			System.out.println("**********************");
			System.out.println("Queue is empty");
			System.out.println("**********************");

			return 0;
		}
		else{
			++front;
			int element = queue[front];

			queue[front] = 0;
			
			System.out.println("Deleted : " + element);
			return element;
		}
	}

	@Override
	public boolean IsEmpty() {
		if (front == rear) {
			return true;
		}
		else return false;
	}

	@Override
	public boolean IsFull() {
		if(rear == n-1)
			return true;
		else return false;
	}
	
	public void display() {
		System.out.println("**********************");
		System.out.println("Elements in queue");
		
		for (int i = 0;i < queue.length;++i ) {
			System.out.print(queue[i] + "  ");;
		}
		System.out.println(" ");
		System.out.println("**********************");
		
	}

}