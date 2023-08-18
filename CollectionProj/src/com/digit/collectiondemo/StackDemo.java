package com.digit.collectiondemo;
import java.util.Stack;
public class StackDemo {
   public static void main(String[] args) {
	 Stack<Integer>stack=new Stack<Integer>();
	 stack.push(25);
	 stack.push(56);
	 stack.push(12);
	 stack.push(44);
	 //Peek will display the topmost element of the stack
	 System.out.println("Peek element of stack: "+stack.peek());
	 for(Integer s:stack)
		 System.out.println(s);
	 
	/* System.out.println("Popped element: "+stack.pop());
	 System.out.println("Popped element: "+stack.pop());
	 System.out.println("Popped element: "+stack.pop());
	 System.out.println("Popped element: "+stack.pop());
	 
	 System.out.println(stack.empty()); */
	 
	 System.out.println("Status of element 12 : "+stack.search(12));
	 while(!stack.empty())
		 System.out.println(stack.pop());
 
   }
}
