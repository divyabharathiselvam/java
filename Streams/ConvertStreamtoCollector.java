package Streams;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class ConvertStreamtoCollector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List <Integer>ls=new ArrayList<Integer>();//create a list
for(int i=1;i<11;i++){
ls.add(i);//iterate value
	}
Stream <Integer>stream=ls.stream(); //create a stream for convert to list
List <Integer>e= (List<Integer>) stream.filter(i -> i%2==0).collect(Collectors.toList());
	System.out.println(e);
 	
	}
}
