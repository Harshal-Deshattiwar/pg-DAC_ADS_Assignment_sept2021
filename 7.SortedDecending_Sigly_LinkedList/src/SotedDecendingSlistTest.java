

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.jupiter.api.Test;



class SotedDecendingSlistTest {

	@Test
	void test() throws CustomException {
		SortedDecendingSList sdl= new SortedDecendingSList();
		sdl.Insert(5);
		sdl.Insert(6);
		sdl.Insert(7);
		sdl.Insert(8);
		sdl.Insert(9);
		sdl.Delete(5);
		sdl.Delete(9);
		sdl.Delete(7);
		int[] excp= {8,6};
		Assert.assertArrayEquals(sdl.getElements(), excp);
	}
	
	@Test
	void test1() {
		SortedDecendingSList sdl= new SortedDecendingSList();
		sdl.Insert(5);
		sdl.Insert(6);
		sdl.Insert(7);
		sdl.Insert(8);
		sdl.Insert(9);
		boolean excp=false;
		boolean check=sdl.Search(2);
		assertEquals(excp, check);
	}
	
	@Test
	void test2() throws CustomException {
		SortedDecendingSList sdl= new SortedDecendingSList();
		sdl.Insert(5);
		sdl.Insert(6);
		sdl.Insert(7);
		sdl.Insert(5);
		sdl.Insert(8);
		sdl.Insert(9);
		sdl.Insert(5);
		sdl.DeleteAll(5);
		int[] excp= {6,7,8,9};
		Assert.assertArrayEquals(sdl.getElements(), excp);
	}

}
