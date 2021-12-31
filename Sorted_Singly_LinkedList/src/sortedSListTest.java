import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class sortedSListTest {
	@Test
	void test() {
		SortedSList l = new SortedSList();

		l.Insert(10);
		l.Insert(5);
		l.Insert(20);
		l.Insert(1);
		l.Insert(15);

		int[] expected = {1, 5, 10, 15, 20};

		assertArrayEquals(l.getElements(), expected);
	}

	@Test
	void test2() {
		SortedSList l = new SortedSList();

		l.Insert(10);

		int[] expected = {10};

		assertArrayEquals(l.getElements(), expected);
	}

	@Test
	void test3() {
		SortedSList l = new SortedSList();

		l.Insert(10);
		l.Insert(1);

		int[] expected = {1, 10};

		assertArrayEquals(l.getElements(), expected);
	}


	@Test
	void test4() {
		SortedSList l = new SortedSList();

		l.Insert(10);
		l.Insert(100);

		int[] expected = {10, 100};

		assertArrayEquals(l.getElements(), expected);
	}
}
