

public class circularQueueImpl implements circularQInf {

	int front, rear, size;
	int cirQ[];
	
	public circularQueueImpl(int n) {
		this.size = n;
		front = rear = -1;
		cirQ = new int[n];
	}

	@Override
	public void AddQ(int element) {
		if (IsFull()) {
			
			System.out.println("Queue is full");
		}
		else if (IsEmpty()) {
			front = 0;
			rear = 0;
			cirQ[rear] = element;
			
			System.out.println("Added : " + element);
		} 
		else {

			rear = ((rear+1) % (size));
			cirQ[rear] = element;
			System.out.println("enter else");
			System.out.println("Added : " + element);
		
//			System.out.println("rear = "+rear);
			}

		}

	

	@Override
	public int DeleteQ() {
		if (IsEmpty()) {
//		cirQ[front] = 0;
		System.out.println("Queue is empty");
		return 0;
		}
		
		int temp = cirQ[front];
		cirQ[front] = 0;
		if (front == size) {front = 0;}
		
		else if(front  == rear) {front = rear = -1 ;}
		else {front++;}
		System.out.println("Deleted : " + temp);
//		System.out.println(front);
//		System.out.println(rear);
		return temp;
	}

	@Override
	public boolean IsEmpty() {
		if (front == -1)
			return true;
		else return false;
	}

	@Override
	public boolean IsFull() {
		if (rear == (size - 1) && front == 0)
			return true;
		else if (rear +1 == front)
			return true;
		else
			return false;
	}
	
	public void display() {
		System.out.println("**********************");
		System.out.println("Elements in queue");
		
		for (int i = 0;i < cirQ.length;++i ) {
			System.out.print(cirQ[i] + "  ");;
		}
		System.out.println(" ");
		System.out.println("**********************");
		
	}

}
