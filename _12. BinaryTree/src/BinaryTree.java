public class BinaryTree {
	BTNode root;

	int[] result;
	int count;

	public BinaryTree() {
		root = null;
	}

	private int getCount(BTNode node) {
		// if (node is empty) then
		if (node == null) {
			// Stop.
			return 0;
		}

		int result = 0;
		// if (node has a left child) then
		if (node.lChild != null) {
			// Inorder(node's left child)
			result += getCount(node.lChild);
		}

		// Process node.
		++result;

		// if (node has a right child) then
		if (node.rChild != null) {
			// Inorder(node's right child)
			result += getCount(node.rChild);
		}

		return result;
	}

	private void Inorder(BTNode node) {
		// if (node is empty) then
		if (node == null) {
			// Stop.
			return;
		}

		// if (node has a left child) then
		if (node.lChild != null) {
			// Inorder(node's left child)
			Inorder(node.lChild);
		}

		// Process node.
		//System.out.println(node.data);
		result[count] = node.data;
		++count;

		// if (node has a right child) then
		if (node.rChild != null) {
			// Inorder(node's right child)
			Inorder(node.rChild);
		}
	}

	public int[] Inorder() {
		result = new int[getCount(root)];
		count = 0;

		Inorder(root);

		return result;
	}
	
	public void PreOrder(BTNode node) {
		if(node==null)
			return;
		//process the current node
		result[count] = node.data;
		++count;
		
		//process the left node
		if(node.lChild !=null)
			PreOrder(node.lChild);
		
		//process the right node
		if(node.rChild!=null)
			PreOrder(node.rChild);
	}
	
	public int[] PreOrder() {
		result=new int[getCount(root)];
		count=0;
		PreOrder(root);
		return result;
	}
	
	public void PostOrder(BTNode node) {
		if(node==null)
			return;
		
		
		//process the left node
		if(node.lChild !=null)
			PostOrder(node.lChild);
		
		//process the right node
		if(node.rChild!=null)
			PostOrder(node.rChild);
		
		//process the current node
		result[count] = node.data;
		++count;
	}
	
	public int[] PostOrder() {
		result=new int[getCount(root)];
		count=0;
		PostOrder(root);
		return result;
	}
	
	public void leafNode(BTNode node) {
		if(node==null)
			return;
		//find leaf node
		if(node.lChild == null && node.rChild == null) {
			++count;
		}
		
		if(node.lChild !=null)
			leafNode(node.lChild);
		
		if(node.rChild!=null)
			leafNode(node.rChild);
	}
	
	public int CountLeafNodes() {
		count=0;
		leafNode(root);
		return count;
	}
	
	
	public void CreateBinaryTree01() {
		BTNode n1, n2, n3, n4;

		n1 = new BTNode(1);
		n2 = new BTNode(2);
		n3 = new BTNode(3);
		n4 = new BTNode(4);

		n1.lChild = n2;
		n1.rChild = n3;

		n2.lChild = n4;

		root = n1;
	}
}
