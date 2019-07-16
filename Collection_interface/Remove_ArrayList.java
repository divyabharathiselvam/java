package Collection_interface;

import java.util.*;

public class Remove_ArrayList extends ArrayList<Integer>{

	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Initial list of elements: " + al);
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		System.out.println("After invoking add(E e) method: " + al);
		// Adding an element at the specific position
		al.add(1, "Gaurav");
		System.out.println("After invoking add(int index, E element) method: " + al);
	
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Sonoo");
		al2.add("Hanumat");
		// Adding second list elements to the first list
		al.addAll(al2);
		System.out.println("After invoking addAll(Collection<? extends E> c) method: " + al);
		
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("John");
		al3.add("Rahul");
		// Adding second list elements to the first list at specific position
		al.addAll(1, al3);
		System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: " + al);
		al.remove("Vijay");
		al.remove(3);
		al.removeAll(al2);
		System.out.println(al);
		
		Remove_ArrayList ai=new Remove_ArrayList();
		ai.add(1242);
		ai.add(131244);
		ai.add(431);
		ai.add(432);
		ai.add(4321);
		ai.add(435);
		ai.removeRange(0,4); 
	        System.out.println("The list after using removeRange:" + ai); 
		
		
	}
}