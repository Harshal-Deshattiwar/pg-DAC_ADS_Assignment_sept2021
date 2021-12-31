import java.util.Arrays;

public class mainProg {

	public static void main(String[] args) {
		BinaryTree bt01 = new BinaryTree();

		bt01.CreateBinaryTree01();
		int[] inOrder = bt01.Inorder();
		int[] preOrder=bt01.PreOrder();
		int[] postOrder=bt01.PostOrder();
		int leafCount=bt01.CountLeafNodes();
		System.out.println(Arrays.toString(inOrder));
		System.out.println(Arrays.toString(preOrder));
		System.out.println(Arrays.toString(postOrder));
		System.out.println(leafCount);

		BST bst01 = new BST();
		bst01.CreateBST01();

		if (bst01.Search(90))
			System.out.println("90 Found");
		else
			System.out.println("90 Not Found");
			
		if (bst01.Search(40))
			System.out.println("40 Found");
		else
			System.out.println("40 Not Found");
	}
}
