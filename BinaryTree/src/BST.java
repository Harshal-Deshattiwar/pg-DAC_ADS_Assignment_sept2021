public class BST {
	BTNode root;

	public BST() {
		root = null;
	}

	public boolean Search(int element) {
		// Set current to root.
		BTNode current = root;

		// while (current != empty) do
		while (current != null) {
			// if (element = current's data) then
			if (element == current.data) {
				// FOUND
				// Stop
				return true;
			}

			// if (element < current's data) then
			if (element < current.data) {
				// Set current to current's left child.
				current = current.lChild;
			} else {
				// Set current to current's right child.
				current = current.rChild;
			}
		}

		// NOT FOUND
		return false;
	}

	public void CreateBST01() {
		BTNode n1, n2, n3, n4, n5, n6, n7;

		n1 = new BTNode(50);
		n2 = new BTNode(20);
		n3 = new BTNode(100);
		n4 = new BTNode(10);
		n5 = new BTNode(30);
		n6 = new BTNode(80);
		n7 = new BTNode(90);

		n1.lChild = n2;
		n1.rChild = n3;

		n2.lChild = n4;
		n2.rChild = n5;

		n3.lChild = n6;

		n6.rChild = n7;

		root = n1;
	}
}
