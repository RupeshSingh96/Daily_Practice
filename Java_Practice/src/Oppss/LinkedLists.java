package Oppss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedLists {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(50);
		linkedList.add(60);
		linkedList.get(3);
		linkedList.addFirst(5);
		linkedList.addLast(70);
		System.out.println(linkedList);
		
		linkedList.removeIf(x -> x% 2==0);
		System.err.println(linkedList);
		
		
		LinkedList<String> animals = new LinkedList<>(Arrays.asList("CAT","dog","elephant"));
		LinkedList<String>remove = new LinkedList<>(Arrays.asList("CAT","elephant"));
		animals.removeAll(remove);
		System.out.println(animals);

	}

}
