package Set_List;
import java.util.*;  
class HashMap3{  
 public static void main(String args[]){  
   HashMap<Integer,String> hm=new HashMap<Integer,String>();    
      hm.put(100,"Amit");    
      hm.put(101,"Vijay");    
      hm.put(102,"Rahul");   
      System.out.println("1.Initial list of elements:");  
     for(Map.Entry m:hm.entrySet())  
     {  
        System.out.println(m.getKey()+" "+m.getValue());   
     }  
     System.out.println("2.Updated list of elements:");  
     hm.replace(102, "Gaurav");  
     for(Map.Entry m:hm.entrySet())  
     {  
        System.out.println(m.getKey()+" "+m.getValue());   
     }  
     System.out.println("U3.pdated list of elements:");  
     hm.replace(101, "Vijay", "Ravi");  
     for(Map.Entry m:hm.entrySet())  
     {  
        System.out.println(m.getKey()+" "+m.getValue());   
     }   
     System.out.println("4.Updated list of elements:");  
     hm.replaceAll((k,v) -> "Ajay");  
     for(Map.Entry m:hm.entrySet())  
     {  
        System.out.println(m.getKey()+" "+m.getValue());   
     }  
 }  
}  