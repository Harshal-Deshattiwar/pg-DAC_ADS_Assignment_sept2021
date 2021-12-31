import java.util.Arrays;

public class MainProg {

	public static void main(String[] args) throws CustomException {
		DescCircularSortedDList cdl= new DescCircularSortedDList();
		cdl.Insert(13);
		cdl.Insert(3);
		cdl.Insert(4);
		cdl.Insert(5);
		cdl.Insert(6);
		System.out.println(Arrays.toString(cdl.getElements()));
		cdl.Delete(13);
		cdl.Delete(5);
		cdl.Delete(3);
		System.out.println(Arrays.toString(cdl.getElements()));
		cdl.Delete(4);
		System.out.println(Arrays.toString(cdl.getElements()));
		cdl.Delete(6);
		System.out.println(Arrays.toString(cdl.getElements()));
		cdl.Insert(13);
		cdl.Insert(3);
		cdl.Insert(4);
		cdl.Insert(4);
		cdl.Insert(4);
		cdl.Insert(5);
		cdl.Insert(6);
		System.out.println(Arrays.toString(cdl.getElements()));
		cdl.DeleteAll(4);
		System.out.println(Arrays.toString(cdl.getElements()));
		cdl.DeleteAll(9);
		System.out.println(cdl.Search(8));
	}

}
