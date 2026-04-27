package Oppss;

import java.util.LinkedList;
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
	
	LinkedList<Integer> ll = new LinkedList<>();
	ll.addLast(50); //as linked list follow doubly nodes so we can follow the next node data easily thats why as like stack ll also get first and last data like pop peek 
	ll.addFirst(30);
	ll.getLast();
	ll.removeLast();
	
}
}
