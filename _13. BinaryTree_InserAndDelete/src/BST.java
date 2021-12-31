public class BST {
	BTNode root;
	int[] result;
	int count;
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
	
	
	public void Insert(int element) {
		BTNode previous = null;
		BTNode current = root;
		while(current !=null) {
			previous = current;
			if(element < current.data)
				current= current.lChild;
			else current= current.rChild;
		}
		
		BTNode newNode = new BTNode(element);
		newNode.lChild=newNode.rChild=null;
		if(previous == null) {
			root=newNode;
			return;
		}
		
		if(element < previous.data)
			previous.lChild= newNode;
		else previous.rChild=newNode;
	}
	
	public void Delete(int element) throws CustomException {
		BTNode previous = null;
		
		BTNode current = root;
		
		while(current !=null) {
			if(element == current.data)
				break;
			previous=current;
			if(element < current.data)
				current=current.lChild;
			else current=current.rChild;
			
		}//end of while loop
		
		if(current==null)
			throw new CustomException("!!! Element not found");
		
		//deleting leaf node -------start
		if(current.lChild==null && current.rChild==null) {
			//deleting root node
			if(current==root) {
				root=null;
				return;
			}
			//to delete a node ....check which side it belongs to its parent node
			if(current == previous.lChild) {
				previous.lChild=null;
			}else {
				previous.rChild=null;
			}
			return;
		}//deleting leaf node -------end
		
		//delete node with only one child------start
		//right child check
		if(current.lChild==null) {
			//only right child of current is valid <----------------------------------------------
			if(current==root)
				root=current.rChild;
			//current left child is empty so right child is only child
			//check where current is place w.r.t previous
			//if current is previous left child
			if(current==previous.lChild)
				previous.lChild=current.rChild; //set previous left node as current right node
			//if current is previous right child
			else previous.rChild=current.rChild; //set previous right as current right child
			return;
		}
		
		//left child of previous check
		if(current.rChild==null) {
			//only left of current valid <-------------------------------------------------------------------
			if(current==root)
				root=current.lChild;
			//if current is previous left child
			if(current==previous.lChild)
				previous.lChild=current.lChild;
			//if current is previous right child
			else previous.rChild=current.lChild;
			return;
		}//left child of previous check <---------------------------------------------------------
			
		// Deleting a node with two child’s !!!
		// Find inorder successor of current
		// => leftmost node in current’s right subtree.
		BTNode inorderSuccessor = current.rChild;
		BTNode isParent=current;
		while(inorderSuccessor.lChild !=null) {
			isParent=inorderSuccessor;
			inorderSuccessor=inorderSuccessor.lChild;
		}
		// Swap values of inorderSuccessor and current node.
		BTNode temp = inorderSuccessor;
		inorderSuccessor=current;
		current=temp;
		
		// Delete inorderSuccessor node.
		// Is inorderSuccessor a leaf node.
		if(inorderSuccessor.lChild==null & inorderSuccessor.rChild==null) {
			if(inorderSuccessor.lChild==isParent)
				isParent.lChild=null;
			else isParent.rChild=null;
			return;
		}
		// inorderSucessor has one child
		// => Make that child as child of parent of inorderSuccessor.
		// Since its only child of inorderSuccessor, it is guaranteed to be right
		if(inorderSuccessor==isParent.lChild) {
			isParent.lChild=inorderSuccessor.rChild;
			return;
		}else {
			isParent.rChild=inorderSuccessor.rChild;
			return;
		}
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
