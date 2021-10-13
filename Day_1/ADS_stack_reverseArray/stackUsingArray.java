package ADS_stack_reverseArray;

public class stackUsingArray implements stackInf {
	
	int top;
	int n;
	int stack[];
	
	
	
	
	public stackUsingArray(int n) {
		this.top = -1;
		this.n = n;
		this.stack = new int[n];
	}

	@Override
	public void Push(int element) {
//		 TODO: What is stack is full?
		if(Isfull()) {
			System.out.println("stack is full");
			return;
		}
		else{
			++top;
			stack[top] = element;
//			System.out.println(stack[top]);
		}
		
		
	}

	@Override
	public int Pop() {
		// TODO: What is stack is empty?
		if(IsEmpty()) {
			System.out.println("stack is empty");
			return 0;
		}
		else{
			int element = stack[top];
			--top;
//			System.out.println(element);
			return element;
		}
	}

	@Override
	public boolean IsEmpty() {
		if (top == -1)
			return true;
		return false;
	}

	@Override
	public boolean Isfull() {
		if (top == n-1)
			return true;
		return false;
	}
	

}
