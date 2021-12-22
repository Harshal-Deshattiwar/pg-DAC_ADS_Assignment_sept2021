import java.util.Arrays;

public class mainProg {
	public static void main(String[] args) {
		SList l1 = new SList();

		l1.AddAtFront(5);
		l1.AddAtRear(10);
		l1.AddAtFront(1);
		l1.AddAtRear(20);

		System.out.println(Arrays.toString(l1.getElements()));
	}

}
