
public class CQueueUsingArray implements QueueInf{
	int n, front,rear;
	int[] queue;
	public CQueueUsingArray(int n) {
		this.n = n;
		this.front = -1;
		this.rear = -1;
		this.queue = new int[n];
	}

	@Override
	public void AddQ(int element) throws CustomException {
		if(IsFull())
			throw new CustomException("Queue is full");
		
		rear=(rear+1)%n;
		queue[rear] = element;
		if(front == -1)
			front=0;
		
		
	}

	@Override
	public int DeleteQ() throws CustomException {
		if(IsEmpty())
			throw new CustomException("Queue is Empty");
		int element = queue[front];
		queue[front]=0;
		front=(front+1)%n;
		if(IsFull())
			front=-1;
		return element;
	}

	@Override
	public boolean IsEmpty() {
		if(front== rear)
			return true;
		return false;
	}

	@Override
	public boolean IsFull() {
		if (front == 0 && rear == n - 1) 
		      return true;
		    
		else if (front == (rear + 1)%n)
		      return true;
		    
		return false;
	}

}
