package Que2;

import java.util.Stack;

public class Queue implements QueueInf{
	private Stack<Integer> stack1, stack2;
	
	public Queue(){
		stack1=new Stack<Integer>();
		stack2=new Stack<Integer>();
	}

	@Override
	public void enQueue(int num){
		//check the is empty condition
		//if the queue is not empty:- move all the elements from stack1 to stack2
		while (!stack1.isEmpty())
        {
			int temp=stack1.pop();
			//remove top element form stack 1
			//push that element in stack 2
			stack2.push(temp);
        }
 
        // Push num  into stack1
		stack1.push(num);
 
        // now the stack 1 has only one element at the bottom
		//push all elements back to stack1 from stack 2
        while (!stack2.isEmpty())
        {
        	int temp=stack2.pop();
        	stack1.push(temp);
        }
		
	}

	@Override
	public int deQueue() throws CustomException {
		//to check if the queue is empty
		//check only stack 1
		if (stack1.isEmpty())
        {
            throw new CustomException("!!!!!!!The queue is empty!!!!!!");
        }
 
        //pop the element from the top of stack 1
        int element = stack1.pop();;
        return element;
	}

	public Stack<Integer> getStack1() {
		return stack1;
	}



}
