//Arrays.binarySearch() method 
package Arrays_class;

import java.util.Arrays;

public class Arrays_BinaryMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = { 25, 37, 4, 5, 1, 222, 1123, 44 };
		Arrays.sort(ar);
		for (int b : ar)
		System.out.println(b);
		int intKey = 44;
		int ar1 = Arrays.binarySearch(ar, intKey);
		System.out.println("binary search of key index:" + ar1);
		int Ranges=Arrays.binarySearch(ar, 2,6, intKey);
		System.out.println("ranges of 0,6"+Ranges);
		
		
		
		
		
		//This method searches a range of the specified array for the specified object using the binary search algorithm.
	}

}
/*
 * public class Sorting { public static void main (String [] args) { int []
 * array = {45,12,85,32,89,39,69,44,42,1,6,8}; Arrays.sort(array); for (int i =
 * 0; i < array.length; i++) { System.out.println(array[i]); }; } }
 */