import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class StackUsingListTest {

	@Test
	void test() throws CustomException {
		StackUsingList sl= new StackUsingList();
		sl.Push(3);
		sl.Push(4);
		sl.Push(5);
		sl.Push(6);
		sl.Pop();
		sl.Pop();
		int[] exp = {3,4,0,0,0};
		Assert.assertArrayEquals(sl.getStack(), exp);
	}

}
