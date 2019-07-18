package Streams;
import java.util.*;
import java.util.stream.Stream;
public class StreamToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*List <Integer>ls=new ArrayList();
for(int i=1;i<10;i++){
	ls.add(i);
}
Stream<Integer>stream =ls.stream();
Integer[] dl=stream.filter(i->i%2!=0).toArray(Integer []::new);
System.out.println(dl);*/
		
		 List<Integer> list = new ArrayList<Integer>();
         for(int i = 1; i< 10; i++){
             list.add(i);
         }
         Stream<Integer> stream = list.stream();
         Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
         System.out.print(evenNumbersArr);
	}

}
