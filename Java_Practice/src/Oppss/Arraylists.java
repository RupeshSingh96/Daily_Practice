package Oppss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylists {
	public static void main(String[] args) {
		
		List<String> list1= Arrays.asList("Jan","Feb","March");
		System.out.println(list1);
		list1.set(2, "April");
		list1.get(2);
		
		String[]array = {"MON","TUE","wed"};
		List<String>list2 = Arrays.asList(array);
		System.out.println(list2.getClass().getName());
		
		List<String>list3 = new ArrayList<>(list2);
		list3.add("thur");
		System.out.println(list3);
		
		
		List<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		l1.add(2,30); 
		l1.set(3, 20);
		for(int x : l1) {
			System.out.println(x);
		}
		
int size = l1.size();
System.out.println(size);

	}
}
