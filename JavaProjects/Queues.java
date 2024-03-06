//*********************************************************
//
// Queue =  FIFO data structure (Fast-In First-Out)
//		    collection designed to store elements prior to processing (imagine people waiting in line to get orders at a fast-food)
//			linear data structure
//
//			offer()  - to add obj to the top (enqueue/add)
//			poll()   - to remove obj from the top (dequeue/remove)
//			peek()   - gets the first object without removing it
//			size()   - gets size of queue
//			contains(obj) - boolean if the obj is or not
//			isEmpty() - boolean if queue has obj or not
//
// Uses of queues:  1. Keyboard Buffers (if you type too fast there is a delay)
//					2. Xerox queue
//					3. Used in LinkedLists, PriorityQueues, Breath-first search
//
//*********************************************************


import java.util.LinkedList; 
import java.util.Queue;

public class Queues {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<String>();
		
		System.out.println("Is the queue empty? " +queue.isEmpty());
		
		queue.offer("Karren");
		queue.offer("Chad");
		queue.offer("Steve");
		queue.offer("Harold");
		
		System.out.println(queue); // [Karren, Chad, Steve, Harold]
		System.out.println("Is the queue empty? " +queue.isEmpty()); // Is the queue empty? false
		
		System.out.println(queue.peek()); // Karen

		queue.poll();
		System.out.println(queue); // [Chad, Steve, Harold]
		
		System.out.println(queue.peek()); // Chad
		
		System.out.println(queue.size()); // 3
		
		System.out.println(queue.contains("Harold")); // true
		
		
		
	}

}
