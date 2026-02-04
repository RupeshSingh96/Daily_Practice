package Oppss;

import java.util.Stack;

public class Stacks {
public static void main(String[] args) {
	Stack<Integer> stacks= new Stack<>();
	stacks.add(10);
	stacks.push(20);
	stacks.push(30);
	stacks.push(100);
	System.out.println(stacks);
	stacks.pop();	
	System.out.println(stacks.peek());
	System.out.println(stacks);
}
}
