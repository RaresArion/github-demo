//*********************************************************
//
// stack =  LIFO data structure (Last-In First-Out) 
//		    stores objects into a sort of 'vertical tower'
//
//			push()  - to add obj to the top
//			pop()   - to remove obj from the top
//			peek()  - gets the first object without removing it
//			empty() - tests if my stack is empty or not (returns a boolean)
//			search() - returns the index at where my object is (from top(1) - bottom(n)); its argument is an object that is inside the stack
//
//
// Uses of stacks:  1. Undo/redo features in text editors (Ctrl-z thingy)
//					2. Moving back/forward through browser history
//					3. Backtracking algorithms (maze, file directories)
//					4. Calling functions (call stack) 
//
//*********************************************************

import java.util.Stack;



public class LIFO {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		System.out.println("Is the queue empty? " +stack.isEmpty());
		System.out.println("Is the queue empty? " +stack.empty());
		stack.push("Minecraft");
		stack.push("Doom");
		stack.push("Skyrim");
		stack.push("Warcraft");
		stack.push("BG3");
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.empty());
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.search("Warcraft"));
		System.out.println(stack.search(3));
		
		}

	

}
