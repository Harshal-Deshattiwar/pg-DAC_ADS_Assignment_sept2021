package Que1;

import java.util.Stack;

public class TreeOperations {
	
	static Stack<Integer> oddElements=  new Stack<Integer>();
	public void oddLevelElements(TreeNode root, boolean isOdd) {
		//Check if tree is empty
		//if empty root is null
		
		if(root==null)
			return;
		//root level =1
		//in first recursion the isOdd=true level =1 as root is at first position
		//second recursion isOdd=false level =2
		//third recursion isOdd=true level =3 
		//therefore isOdd=false for odd levels
		if (isOdd == true) {
			
		    oddElements.push(root.getData());
		}
		 
		      
		     //left child recursion
		    oddLevelElements(root.getlChild(), !isOdd);
		    //right recursion
		    oddLevelElements(root.getrChild(), !isOdd);
	}
	
	public boolean isOdd(int level) {
		if(level%2==0)
			return false;
		return true;
		
	}
	public  Stack<Integer> getOddElements() {
		return oddElements;
	}
}
