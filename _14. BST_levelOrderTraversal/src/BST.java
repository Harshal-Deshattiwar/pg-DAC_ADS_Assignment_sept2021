import java.util.LinkedList;
import java.util.Queue;

public class BST {
	BTNode root;
	int[] result;
	int count;
	public BST() {
		root = null;
	}
	
	public void levelOrderTraversal() {
		Queue<BTNode> q = new LinkedList<BTNode>();
		q.add(root);

		while(!q.isEmpty()) {
			//poll delete the and return head of the list
			BTNode current=q.poll();
			System.out.print(current.data+" ");
			
			if(current.lChild!=null)
				q.add(current.lChild);
				//add left node if available
			
			if(current.rChild!=null) 
				q.add(current.rChild);
				//add right node if available
		}
	}

	public void CreateBST01() {
		BTNode n1, n2, n3, n4, n5, n6, n7;

		n1 = new BTNode(1);
		n2 = new BTNode(2);
		n3 = new BTNode(3);
		n4 = new BTNode(4);
		n5 = new BTNode(5);
		n6 = new BTNode(6);
		n7 = new BTNode(7);

		n1.lChild = n2;
		n1.rChild = n3;

		n2.lChild = n4;
		n2.rChild = n5;

		n3.lChild = n6;

		n6.rChild = n7;

		root = n1;
	}
}
