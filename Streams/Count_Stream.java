package Streams;

import java.util.ArrayList;
import java.util.List;

public class Count_Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> memberNames=new ArrayList();
		memberNames.add("Amitabh");
		memberNames.add("Diyasree");
		memberNames.add("Aman");
		memberNames.add("Puvi");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Sathish");
	long counts=	memberNames.stream().filter((s)->s.startsWith("S")).count();
	System.out.println(counts);
	}

}
