package pakage;


public class StackUsingArray implements StackIntf {
	int top;
	int[] stack;
	int n;

	public StackUsingArray(int n) {
		this.n = n;
		stack = new int [n];
		top = -1;
	}

	@Override
	public void Push(int element) throws CustomException {
		if(IsFull())
			throw new CustomException("stack is full");                  
		++top;
		stack[top] = element;
	}

	@Override
	public int Pop() throws CustomException {
		if(IsEmpty())
			throw new CustomException("Stack is empty");
		int element = stack[top];
		--top;
		return element;
	}

	@Override
	public boolean IsEmpty() {
		if (top == -1)
			return true;
		return false;
	}

	@Override
	public boolean IsFull() {
		if (top == n - 1)
			return true;
		return false;
	}

}
