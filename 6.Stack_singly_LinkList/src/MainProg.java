import java.util.Arrays;

public class MainProg {

	public static void main(String[] args) throws CustomException {
		StackUsingList sl= new StackUsingList();
		sl.Push(3);
		sl.Push(4);
		sl.Push(5);
		sl.Push(6);
		System.out.println(Arrays.toString(sl.getStack()));
		sl.Pop();
		sl.Pop();
		System.out.println(Arrays.toString(sl.getStack()));
	}

}
