package Set_List;
//Java Map Example: comparingByValue()
import java.util.*;
public class MaPExample5 {
	public static void main(String args[]){  
		Map<Integer,String> map=new HashMap<Integer,String>();          
		      map.put(100,"Amit");    
		      map.put(101,"Vijay");    
		      map.put(102,"Rahul"); 
		      map.put(104, "Amit");
		      //Returns a Set view of the mappings contained in this map    
		      map.entrySet()  
		      //Returns a sequential Stream with this collection as its source  
		      .stream()  
		      //Sorted according to the provided Comparator  
		      .sorted(Map.Entry.comparingByValue())  
		      .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))  
		      //Performs an action for each element of this stream  
		      .forEach(System.out::println);  
		 }  
}
