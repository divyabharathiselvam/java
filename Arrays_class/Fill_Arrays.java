package Arrays_class;

import java.util.Arrays;

public class Fill_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArr[]= { 10, 20, 15, 22, 35,56,788  }; 
		  int intArr1[] = { 10, 15, 22 }; 
		  
		int key=24;
		Arrays.fill(intArr, key);
	System.out.println(Arrays.toString(intArr));

	}

}
