
public interface QueueIntf {
	public void AddQ(int element) throws CustomException;
	public int DeleteQ() throws CustomException;
	public boolean IsEmpty();
	//public boolean IsFull();
}
