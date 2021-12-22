package pakage;


public interface StackIntf {
	public void Push(int element) throws CustomException;
	public int Pop() throws CustomException;
	public boolean IsEmpty();
	public boolean IsFull();
}
