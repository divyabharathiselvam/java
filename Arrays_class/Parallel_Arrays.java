package Arrays_class;

import java.util.Arrays;

public class Parallel_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArr[]= { 10, 20, 15, 22, 35,56,788  }; 
		/*Arrays.parallelSort(intArr);//parallelSort(originalArray):
		System.out.println(Arrays.toString(intArr));
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));*/
		
		//parallelPrefix(originalArray, fromIndex, endIndex, functionalOperator)//
		Arrays.parallelPrefix(intArr, (left, right) -> left + right);
		//Arrays.parallelPrefix(intArr,1,4,(left,rigth)->left+rigth);
        System.out.println(Arrays.toString(intArr));
        
        String[] arr = {"apple", "banana", "pie"};
        System.out.println(Arrays.toString(arr));
        Arrays.parallelPrefix(arr, (s,d)->s+"|"+d);
        System.out.println(Arrays.toString(arr));
		
		
	
		
	}

}
