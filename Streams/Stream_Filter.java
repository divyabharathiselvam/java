package Streams;
import java.util.*;
import java.util.stream.*;
public class Stream_Filter {

	public static void main(String[] args) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Diyasree");
		memberNames.add("Aman");
		memberNames.add("Puvi");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Sathish");
		memberNames.stream().filter((s)->s.startsWith("S"))
				.forEach(System.out::println);
		memberNames.stream().filter((s) -> s.startsWith("D"))
        .forEach(System.out::println);
		memberNames.stream().filter((s) -> s.startsWith("D")).map(String::toUpperCase)
		
        .forEach(System.out::println);
	}

}
