import java.util.Arrays;

public class mainProg {

	public static void main(String[] args) throws CustomException {
		BST node = new BST();
//		node.CreateBST01();
		node.Insert(50);
		node.Insert(10);
		node.Insert(20);
		node.Insert(30);
		node.Insert(60);
		node.Insert(65);
		node.Insert(70);
		node.Insert(12);
		System.out.println(Arrays.toString(node.Inorder()));
		node.Delete(30);
		node.Delete(70);
		node.Delete(10);
		System.out.println("");
		System.out.println(Arrays.toString(node.Inorder()));

	}

}
