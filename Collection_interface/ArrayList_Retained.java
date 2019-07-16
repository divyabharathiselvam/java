package Collection_interface;

import java.util.*;

public class ArrayList_Retained {

	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();

		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
	    Collections.sort(al);  // Sort the elements
		System.out.println(al);
	    ArrayList a2 = (ArrayList) al.clone();//clone the al obj to a2
        System.out.println(a2);
		//System.out.println("Before update: "+al.get(1)); 
		ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Ravi");
		al2.add("Hanumat");
		al2.add("Ajay");
		al.retainAll(al2);
	      
        //Updating an element at specific position  
        al.set(1,"Gaurav");  //set the new element by using index value
       /* System.out.println("After update: "+al.get(1));   
		System.out.println("iterating the elements after retaining the elements of al2");
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());*/
        //ArrayList<String> al2=new ArrayList<String>(); 
        System.out.println("Is ArrayList Empty: "+al.isEmpty());
     /*   al2.add("Ravi");
		al2.add("Vijay"); 
		al2.add("Ajay"); 
		System.out.println(  "After Insertion");
		System.out.println("Is ArrayList Empty: "+al.isEmpty());*/

		
	}
}
