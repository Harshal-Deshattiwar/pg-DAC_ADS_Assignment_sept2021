import java.util.Arrays;

public class mainprog {

	public static void main(String[] args) {
		DecsSortedLinkedList dl =new DecsSortedLinkedList();
		dl.Insert(1);
		dl.Insert(2);
		dl.Insert(3);
		dl.Insert(4);
		dl.Insert(5);
		dl.Insert(6);
		dl.Delete(2);
		dl.Delete(1);
		dl.Delete(1);
		System.out.println(Arrays.toString(dl.getElement()));
		System.out.println(dl.Search(7));

	}

}
