package Oppss;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Vectoree {

	public static void main(String[] args) {
		Vector<Integer> v= new Vector<>(5,3);
		v.add(1);
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		System.out.println(v.capacity());
		v.add(60);
		v.add(50);
		v.add(50);
		v.add(50);
		v.add(50);
		System.out.println(v);
		System.out.println(v.capacity());
		LinkedList<Integer>ll= new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		Vector<Integer> v1 = new Vector<>(ll);
		System.out.println(v1);
		
		for(int x =0; x < v1.size();x++) {
			System.out.println(v1.get(x));
		}
//			ArrayList<Integer> al= new ArrayList<>();
			Vector<Integer> al= new Vector<>();

			 Thread t1 = new Thread(() -> {
		            for (int i = 0; i < 1000; i++) {
		                al.add(i);
		            }
		        });
			 Thread t2 = new Thread(() -> {
		            for (int i = 0; i < 1000; i++) {
		                al.add(i);
		            }
		        });
			t1.start();
			t2.start();
			
			try {
				t1.join();
				t2.join();
			}catch (Exception e) {
				e.printStackTrace();
				}
			System.out.println(al.size());
		}
	}

