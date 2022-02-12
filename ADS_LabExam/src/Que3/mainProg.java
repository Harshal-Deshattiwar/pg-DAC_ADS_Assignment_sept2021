package Que3;

import java.util.Arrays;

public class mainProg {

	public static void main(String[] args) throws CustomException {
		SinglyLList obj = new SinglyLList();
		obj.insertAtEnd(2);
		System.out.println("The list after insert "+ Arrays.toString(obj.getElements()));
		obj.insertAtEnd(4);
		System.out.println("The list after insert "+ Arrays.toString(obj.getElements()));
		obj.insertAtEnd(3);
		System.out.println("The list after insert "+ Arrays.toString(obj.getElements()));
		obj.insertAtEnd(5);
		System.out.println("The list after insert "+ Arrays.toString(obj.getElements()));
		obj.insertAtEnd(4);
		System.out.println("The list after insert "+ Arrays.toString(obj.getElements()));
		
		System.out.println("======================Deletion========================");
		obj.deleteFirst();
		System.out.println("The list after Delete "+ Arrays.toString(obj.getElements()));
		obj.deleteFirst();
		System.out.println("The list after Delete "+ Arrays.toString(obj.getElements()));
		obj.deleteFirst();
		System.out.println("The list after Delete "+ Arrays.toString(obj.getElements()));
		obj.deleteFirst();
		System.out.println("The list after Delete "+ Arrays.toString(obj.getElements()));

	}

}
