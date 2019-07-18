package Arrays_class;

import java.util.Arrays;

public class Copyof_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inarr1[] = {1, 2, 3,34,23,6}; 
	//	for(int b:inarr1)
		//System.out.println(Arrays.toString(inarr1)+" "+Arrays.asList(b));
	System.out.println(	Arrays.toString((Arrays.copyOf(inarr1,4)))+" "+Arrays.toString(inarr1));

	}

}
