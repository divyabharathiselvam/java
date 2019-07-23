package LinkedList;
//. Write a Java program to append the specified element to the end of a linked list. Go to the editor

import java.util.*;

public class Main {

	public static void main(String[] args) {

		List ls = new LinkedList();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(4, 5);
		//System.out.println(ls);
// Write a Java program to iterate through all elements in a linked list
		Iterator itr = ls.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
// to iterate through all elements in a linked list starting at the
		// specified position
		Iterator itr1 = ls.listIterator(2);
		while (itr1.hasNext()) {
			System.out.println("iterate  all elements through specified position" + itr1.next());
		}
// . Write a Java program to iterate a linked list in reverse order
		Collections.reverse(ls);
		System.out.println(ls);

// to insert the specified element at the specified position in the
		// linked list
		ls.add(1, 215);
		System.out.println(ls);

// to insert the specified element at the front and end of a linked
		// list.
		((LinkedList) ls).addFirst("FIRST");

		((LinkedList) ls).addLast("last");
		 System.out.println(ls);
// Write a Java program to get the first and last occurrence of the
		// specified elements in a linked list
		
		System.out.println(ls + " " + "first and last" + " " + ls);
// . Write a Java program to display the elements and their positions in
		// a linked list.
		for(int s=0;s<ls.size();s++)
		  	
	        System.out.println(s+" "+ls.get(s));
//. Write a Java program to remove first and last element from a linked list. 
		//Object o=((LinkedList) ls).removeFirst();
		((LinkedList) ls).removeLast();
		System.out.println(ls);
//. Write a Java program of swap two elements in an linked list
	     Collections.swap(ls, 0, 4);
		System.out.println(ls);
//. Write a Java program to shuffle the elements in a linked list
		Collections.shuffle(ls);
		System.out.println(ls);
//Write a Java program to remove and return the first element of a linked list.
		((LinkedList) ls).pop();
		System.out.println(ls);
//. Write a Java program to retrieve but does not remove, the last element of a linked list. 
		Object s=((LinkedList) ls).peekFirst();
		((LinkedList) ls).pop();
		((LinkedList) ls).poll();
		System.out.println(s);
//Write a Java program to check if a particular element exists in a linked list.
		
		if(ls.contains(5 )){
		System.out.println("1 is exist");
		
		}
		else{
			System.out.println(ls.add(6));
			System.out.println(ls);
		}
//Write a Java program to test an linked list is empty or not
		boolean ob=ls.isEmpty();
		System.out.println(ob);
//Write a Java program to replace an element in a linked list
		Collections.replaceAll(ls, 2, 125);
		System.out.println(ls);
	}

}
