package Que2;

public class mainProg {

	public static void main(String[] args) throws CustomException {
		Queue obj = new Queue();
		obj.enQueue(2);
		System.out.println("Queue After enqueue: "+obj.getStack1());
		obj.enQueue(5);
		System.out.println("Queue After enqueue: "+obj.getStack1());
		obj.enQueue(3);
		System.out.println("Queue After enqueue: "+obj.getStack1());
		obj.enQueue(8);
		System.out.println("Queue After enqueue: "+obj.getStack1());
		obj.enQueue(4);
		System.out.println("Queue After enqueue: "+obj.getStack1());
		
		System.out.println("==========Dequeue operation=-========");
		obj.deQueue();
		System.out.println("Queue After Dequeue: "+obj.getStack1());
		System.out.println();
		System.out.println("Queue current: "+obj.getStack1());
		obj.deQueue();
		System.out.println("Queue After Dequeue: "+obj.getStack1());
		System.out.println();
		System.out.println("Queue current: "+obj.getStack1());
		obj.deQueue();
		System.out.println("Queue After Dequeue: "+obj.getStack1());
		System.out.println();
		System.out.println("Queue current: "+obj.getStack1());
		obj.deQueue();
		System.out.println("Queue After Dequeue: "+obj.getStack1());
		System.out.println();
		System.out.println("Queue current: "+obj.getStack1());
		obj.deQueue();
		System.out.println("Queue After Dequeue: "+obj.getStack1());
		System.out.println();
		System.out.println("Queue current: "+obj.getStack1());
		System.out.println("Dequeue an empty queue");
		System.out.println("!!!!!!!!!!The eror will occur as a custom Exception handler!!!!!!!!!!!!!!");
		obj.deQueue();
		System.out.println("Queue After Dequeue: "+obj.getStack1());
		

	}

}
