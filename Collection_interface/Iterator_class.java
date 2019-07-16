package Collection_interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection.*;

public class Iterator_class {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();//Creating array list  
			  list.add("Ravi");//Adding object in array list  //
			  list.add("Vijay");  
			  list.add("Ravi");  
			  list.add("Ajay");  
			  //Traversing list through Iterator  
			  Iterator itr=list.iterator();  
			  while(itr.hasNext()){  
			   System.out.println(itr.next());  
			   for(String obj:list)//for each loop to iterate the element//
				   System.out.println(obj);
			   
			   for(int i = 0;i<list.size();i++){
				   System.out.println(list.get(i));
			   }

	}
	}
}