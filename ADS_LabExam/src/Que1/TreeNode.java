package Que1;

public class TreeNode {
	private int data;
	private TreeNode lChild,rChild;
	
	public TreeNode(int data) {
		this.data=data;
		lChild=null;
		rChild=null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getlChild() {
		return lChild;
	}

	public void setlChild(TreeNode lChild) {
		this.lChild = lChild;
	}

	public TreeNode getrChild() {
		return rChild;
	}

	public void setrChild(TreeNode rChild) {
		this.rChild = rChild;
	}
}
