import java.util.Arrays;

public class StackUsingList implements StackIntf{

	
	SList lk = new SList();
	
	@Override
	public void Push(int element) throws CustomException {
		lk.AddAtRear(element);
	}

	@Override
	public int Pop() throws CustomException {
		if(IsEmpty())
			throw new CustomException("Stack is Empty");
		int element=lk.DeleteLastNode();
		return element;
	}

	@Override
	public boolean IsEmpty() {
		if(lk.getHead() == null)
			return true;
		return false;
	}

	
	public void display() {
		System.out.println("Stack:" + Arrays.toString(lk.getElements())+"") ; 
	}
	
	public int[] getStack() {
		return lk.getElements();
		
	}

}
