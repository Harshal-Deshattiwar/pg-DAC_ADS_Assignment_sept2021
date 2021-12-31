import java.util.Arrays;

public class mainProg {
	public static void main(String[] args) throws CustomException {
		SortedSList l = new SortedSList();

		l.Insert(10);
		l.Insert(5);
		l.Insert(5);
		l.Insert(5);
		l.Insert(20);
		l.Insert(1);
		l.Insert(15);
		l.DeleteAll(5);

		System.out.println(Arrays.toString(l.getElements()));
	}

}
