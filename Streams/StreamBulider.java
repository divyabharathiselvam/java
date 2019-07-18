package Streams;
import java.util.*;
import java.util.stream.Stream;
public class StreamBulider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   List ls=new ArrayList();
   for(int i=0;i<10;i++){
	   ls.add(i);
	   System.out.println(ls);
   }
   //Stream<Date> ss=Stream.generate(()->{return new Date();});
  // ss.forEach(b->System.out.println(b));
   Stream s=ls.stream();// List.stream()
    s.forEach(itr->System.out.println(itr));
	}

	
	
}
