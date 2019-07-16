package Collection_interface;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedList_class {

	public static void main(String[] args) {
		  LinkedList<String> list=new LinkedList<String>();

		     //Adding elements to the Linked list
		     list.add("Steve");
		     list.add("Carl");
		     list.add("Raj");

		     //Adding an element to the first position
		     list.addFirst("Negan");

		     //Adding an element to the last position
		     list.addLast("Rick");

		     //Adding an element to the 3rd position
		     list.add(2, "Glenn");
		    // list.removeFirst();
		     //list.remove(2);
		    // list.removeLast();//remove//remove
		     Object o = list.poll();//remove the first element of list
		     Object o1 = list.pollLast();
		     
		     int pos = list.lastIndexOf("Rick");
		     System.out.println(pos);
		     Object firstvar = list.get(0);
		       System.out.println("First element: " +firstvar);
		       list.set(0, "Changed first item");
		       Object firstvar2 = list.get(0);
		       System.out.println("First element after update by set method: " +firstvar2);

		     //Iterating LinkedList
		     Iterator<String> iterator=list.iterator();
		      // Iterator iterator=list.descendingIterator();  //to reverse a list of elements
		     while(iterator.hasNext()){
		       System.out.println(iterator.next());
		   
		    //   System.out.println(list);
	}

}
}