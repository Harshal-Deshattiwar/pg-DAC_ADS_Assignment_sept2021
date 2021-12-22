import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


class QueueUsingSLL {

	@Test
	void test() throws CustomException {
		QueueUsingSinglyLinkList q1=new QueueUsingSinglyLinkList();
		q1.AddQ(1);
		q1.AddQ(2);
		q1.AddQ(3);
		q1.AddQ(4);
		q1.AddQ(5);
		q1.DeleteQ();
		q1.DeleteQ();
		
		int[] exc = {3,4,5};
		Assert.assertArrayEquals(q1.getQueue(), exc);
	}

}
