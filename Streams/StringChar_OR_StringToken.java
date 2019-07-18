package Streams;
import java.util.stream.*;
public class StringChar_OR_StringToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stream stream= Stream.of("A$B#12313#C".split("\\#"));
stream.forEach(s ->System.out.println(s));
	}

}
