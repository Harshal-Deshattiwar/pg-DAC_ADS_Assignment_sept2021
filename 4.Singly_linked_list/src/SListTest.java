import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SListTest {
	@Test
	void test() {
		SList l1 = new SList();

		l1.AddAtFront(5);
		l1.AddAtFront(1);
		l1.AddAtRear(10);
		l1.AddAtRear(20);

		int[] expected = {1, 5, 10, 20};
		Assert.assertArrayEquals(l1.getElements(), expected);
	}
	@Test
	void test2() {
		SList l1 = new SList();

		assertTrue(l1.head==null);
	}
	
	@Test
	void test3() {
		SList l1 = new SList();
		l1.AddAtFront(5);
		l1.AddAtFront(1);
		l1.AddAtRear(10);
		l1.AddAtRear(20);
		l1.DeleteFirstNode();
		l1.DeleteLastNode();
		int[] expected = {5, 10};
		Assert.assertArrayEquals(l1.getElements(), expected);
	}
}
