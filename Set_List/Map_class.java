package Set_List;
import java.util.*;  
public class Map_class  {  
public static void main(String[] args) {  
    Map map=new HashMap();  
    //Adding elements to map  
    map.put(1,"Amit");  
    map.put(5,"Rahul");  
    map.put(2,"Jai");  
    map.put(6,"Amit");
    map.put(4, 123);
    //Traversing Map  
    
    Set st=map.entrySet();
    //Converting to Set so that we can traverse  
    Iterator itr=st.iterator();  
    while(itr.hasNext()){  
        
    	//System.out.println(itr.next());
    	//Converting to Map.Entry so that we can get key and value separately  
       Map.Entry entry=(Map.Entry)itr.next();  
        System.out.println(entry.getKey()+" "+entry.getValue());  
    }  
}  
}  
