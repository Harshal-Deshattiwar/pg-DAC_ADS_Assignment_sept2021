

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SortedDListTest {
	@Test
	void test() {
		SortedDList l = new SortedDList();

		l.Insert(10);
		l.Insert(5);
		l.Insert(20);
		l.Insert(1);
		l.Insert(15);

		int[] expected = {1, 5, 10, 15, 20};
		Assert.assertArrayEquals(l.getElements(), expected);
	}

	@Test
	void test1() {
		SortedDList l = new SortedDList();

		l.Insert(10);
		l.Insert(5);
		l.Insert(20);
		l.Insert(1);
		l.Insert(15);

		int[] expected = {20, 15, 10, 5, 1};
		Assert.assertArrayEquals(l.getElementsInReverse(), expected);
	}

//	@Test
//	void test2() {
//		CircularSortedDList l = new CircularSortedDList();
//
//		l.Insert(10);
//		l.Insert(5);
//		l.Insert(20);
//		l.Insert(1);
//		l.Insert(15);
//
//		int[] expected = {1, 5, 10, 15, 20};
//		Assert.assertArrayEquals(l.getElements(), expected);
//	}
//
//	@Test
//	void test3() {
//		CircularSortedDList l = new CircularSortedDList();
//
//		l.Insert(10);
//		l.Insert(5);
//		l.Insert(20);
//		l.Insert(1);
//		l.Insert(15);
//
//		int[] expected = {20, 15, 10, 5, 1};
//		Assert.assertArrayEquals(l.getElementsInReverse(), expected);
//	}
}
