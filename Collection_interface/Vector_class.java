package Collection_interface;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class Vector_class {

	public static void main(String[] args)throws Exception {
		/* Vector<String> v=new Vector<String>();//creating vector  
		  v.add("umesh");//method of Collection  
		  v.addElement("irfan");//method of Vector  
		  v.addElement("kumar");  
		  //traversing elements using Enumeration  
		  Enumeration e=v.elements();  //instead of iterator we using vector
		  while(e.hasMoreElements()){  
		   System.out.println(e.nextElement()); 
		   System.out.println("Size is: "+v.size());
		   System.out.println("Default capacity increment is: "+v.capacity());
		   
		   Vector<Integer> v1=new Vector<Integer>();
		   v1.addElement(23);
		   v1.addElement(22);
		   v1.addElement(21);
		   Vector<Integer> v2=new Vector<Integer>();
		   v2.addElement(2324);
		Collections.copy(v2, v1);
		System.out.println(v2);*/

	       //First Vector of String type
	       Vector<String> va = new Vector<String>();
	       //Adding elements to the first Vector
	       va.add("AB");
	       va.add("BC");
	       va.add("CD");
	       va.add("DE");

	       //Second Vector
	       Vector<String> vb = new Vector<String>();
	       //Adding elements to the second Vector
	       vb.add("1st");
	       vb.add("2nd");
	       vb.add("3rd");
	       vb.add("4th");
	       vb.add("5th");
	       vb.add("6th");

	       /*Displaying the elements of second vector before
	         performing the copy operation*/
	       System.out.println("Vector vb before copy: "+vb);

	       //Copying all the elements of Vector va to Vector vb
	       Collections.copy(vb, va);

	       //Displaying elements after copy
	       System.out.println("Vector vb after copy: "+vb);
		   

	}}


