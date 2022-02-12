import java.util.Arrays;

public class LQueueUsingArray implements QueueInf {
	int[] queue;
	int n;
	int front,rear;
	
	public LQueueUsingArray(int n) {
		this.n = n;
		this.queue = new int[n];
		this.front = -1;
		this.rear = -1;
	}

	@Override
	public void AddQ(int element) throws CustomException {
		if(IsFull())
			throw new CustomException("Queue is full");
		queue[++rear]= element;
		if(front==-1) {
			front=rear;//changed
		}
		

	}

	@Override
	public int DeleteQ() throws CustomException {
		if(IsEmpty())
			throw new CustomException("Queue is Empty");
		int element = queue[front++];
		queue[front-1]=0;
		return element;
	}

	@Override
	public boolean IsEmpty() {
		if(front == rear)
			return true;
		return false;
	}

	@Override
	public boolean IsFull() {
		if(rear == (n-1))
			return true;
		return false;
	}

	@Override
	public String toString() {
		return "LQueueUsingArray [queue=" + Arrays.toString(queue) + "]";
	}
	
	

}
