import java.util.Arrays;

public class MainProg {

	public static void main(String[] args) throws CustomException {
		SortedDecendingSList sdl= new SortedDecendingSList();
		sdl.Insert(5);
		sdl.Insert(3);
		sdl.Insert(6);
		sdl.Insert(7);
		sdl.Insert(9);
		sdl.Insert(5);
		sdl.Insert(8);
		sdl.Insert(9);
		sdl.Insert(2);
		sdl.Insert(1);
		sdl.DeleteAll(9);
		sdl.DeleteAll(5);
		sdl.DeleteAll(2);
		
		System.out.println(Arrays.toString(sdl.getElements()));

	}

}
