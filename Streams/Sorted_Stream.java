package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> memberNames = new ArrayList<String>();
		memberNames.add("Abishake");
		memberNames.add("Divya");
		memberNames.add("Ajith");
		memberNames.add("Puvi");
		memberNames.add("Shalini");
		memberNames.add("Yudish");
		memberNames.add("Yana");
		memberNames.add("Sathish");
	List <String> e=	memberNames.stream().sorted()//Sort in streams
		.map(String::toUpperCase).collect(Collectors.toList());
	System.out.println(e);
	}

}
