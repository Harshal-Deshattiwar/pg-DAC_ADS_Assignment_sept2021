package Que1;

public class mainProg {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(11);//root
		root.setlChild(new TreeNode(12));//root left child
		root.setrChild(new TreeNode(13));//rot right child
		
		//left sub tree ---------------------------------
		//12 child
		root.getlChild().setlChild(new TreeNode(14));
		root.getlChild().setrChild(new TreeNode(15));
		
		//12 - 15 child
		root.getlChild().getrChild().setlChild(new TreeNode(17));
		root.getlChild().getrChild().setrChild(new TreeNode(18));
		
		//right sub tree--------------------------------
		//13 child
		root.getrChild().setrChild(new TreeNode(16));
		
		//13 - 16 child
		root.getrChild().getrChild().setlChild(new TreeNode(19));
		
		TreeOperations treeObj= new TreeOperations();
		//pass root an isOdd= true , considering root as level 1
		treeObj.oddLevelElements(root, true);
		
		System.out.println("!!!  Considering root as level 1  !!!");
		System.out.println("The required result: "+ treeObj.getOddElements());
		
	}

}
