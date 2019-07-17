package Set_List;
import java.util.*;  
public class HashMap2 {  
   public static void main(String args[]) {  
    HashMap<Integer,String> map=new HashMap<Integer,String>();          
      map.put(100,"Amit");    
      map.put(101,"Vijay");    
      map.put(102,"Rahul");  
      map.put(103, "Gaurav"); 
      map.put(105,"Vijay");
    System.out.println("1.Initial list of elements: "+map);  
    //key-based removal  
    map.remove(100);  
    System.out.println("2.Updated list of elements: "+map);  
    //value-based removal  
    map.remove(105);  
    System.out.println("3.Updated list of elements: "+map);  
    //key-value pair based removal  
    map.remove(102, "Rahul");  
    System.out.println("4.Updated list of elements: "+map);  
   }      
}  
