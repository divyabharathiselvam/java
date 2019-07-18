package Streams;

import java.util.ArrayList;
import java.util.List;

public class Reduced_Streams {

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
	   memberNames.stream().reduce((s1,s2)->s1+"#"+s2);
	
	
	}

}
