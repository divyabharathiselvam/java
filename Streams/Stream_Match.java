package Streams;
import java.util.stream.*;
import java.util.*;
public class Stream_Match {

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
		Boolean b=memberNames.stream().anyMatch((s)->((String) s).startsWith("A"));
		System.out.println(b);
		Boolean matchedResult = memberNames.stream()
                .noneMatch((s) -> s.startsWith("A"));
		matchedResult = memberNames.stream()
                .allMatch((s) -> s.startsWith("A"));

System.out.println(matchedResult);
System.out.println(matchedResult);
	}

}
