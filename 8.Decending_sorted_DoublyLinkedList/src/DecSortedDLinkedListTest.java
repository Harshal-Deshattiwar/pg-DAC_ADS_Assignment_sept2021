
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DecSortedDLinkedListTest {

	@Test
	void test() {
		DecsSortedLinkedList dl =new DecsSortedLinkedList();
		dl.Insert(1);
		dl.Insert(2);
		dl.Insert(3);
		dl.Insert(4);
		dl.Insert(5);
		dl.Insert(6);
		int[] excp= {6,5,4,3,2,1};
		Assert.assertArrayEquals(dl.getElement(),excp);
	}
	
	@Test
	void test1() {
		DecsSortedLinkedList dl =new DecsSortedLinkedList();
		dl.Insert(1);
		dl.Insert(2);
		dl.Insert(3);
		dl.Insert(4);
		dl.Insert(5);
		dl.Insert(6);
		dl.Delete(2);
		dl.Delete(1);
		dl.Delete(6);
		int[] excp= {5,4,3};
		Assert.assertArrayEquals(dl.getElement(),excp);
	}


}
