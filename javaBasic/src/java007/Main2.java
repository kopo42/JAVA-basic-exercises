package java007;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> name = new LinkedList <String>(); //FIFO
		name.offer("stackone");
		System.out.println(name);
		
		name.offer("stacktwo");
		System.out.println(name);
		
		System.out.println(name.poll());
		System.out.println(name.poll());
		System.out.println(name);
		
		Stack<String> stack = new Stack<String>(); //LIFO
		stack.add("stackOne");
		System.out.println(stack);
		
		stack.add("stacktwo");
		System.out.println(stack);
		
		System.out.println(stack.pop());
		System.out.println(stack);
	}

}
