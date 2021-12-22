
public class TestLQueue {

	public static void main(String[] args) throws CustomException {
		int[] arr = {1, 2, 3, 4, 5};
//		int[] arr = {1, 2, 3, 4, 5,6,7,8,9};
		LQueueUsingArray qObj = new LQueueUsingArray(6);
		for(int element: arr ) {
			qObj.AddQ(element);
		}
		
		System.out.println(qObj);
		
		qObj.DeleteQ();
		qObj.DeleteQ();
		qObj.DeleteQ();
//		qObj.DeleteQ();
//		qObj.DeleteQ();
//		qObj.DeleteQ();
//		qObj.DeleteQ();
		System.out.println(qObj);
	}

}
