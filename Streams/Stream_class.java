package Streams;

import java.util.stream.Stream;

public class Stream_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream stream=Stream.of(1,3,2,4,5,76,33,8);//creating a Stream.of(val1, val2, val3….)
       	//stream.forEach(action->System.out.println(action));
        Stream s=Stream.of(new Integer []{1,2,35,76});
	    s.forEach(a->System.out.println(a));
	}

}
