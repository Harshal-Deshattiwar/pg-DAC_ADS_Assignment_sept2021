
public class QueueUsingSinglyLinkList implements QueueIntf {
	SList sl= new SList();
	@Override
	public void AddQ(int element) throws CustomException {
		sl.AddAtRear(element);
	}

	@Override
	public int DeleteQ() throws CustomException {
		if(IsEmpty())
			throw new CustomException("The queue is empty");
		int element = sl.DeleteFirstNode();
		return element;
	}

	@Override
	public boolean IsEmpty() {
		if(sl.getHead()==null)
			return true;
		return false;
	}
	
	public int[] getQueue() {
		return sl.getElements();
	}
	
}
