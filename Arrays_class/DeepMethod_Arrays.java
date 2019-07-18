package Arrays_class;

import java.util.Arrays;

public class DeepMethod_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int intArr[][] = { { 10, 20, 15, 22, 35,56,788 } }; 
		 int intArr1[][] = { { 10, 20, 15, 22, 35,56,78 } }; 
		 System.out.println( Arrays.deepHashCode(intArr));
		 System.out.println( Arrays.deepEquals(intArr,intArr1));
			
		 System.out.println("Integer Array: "
                 + Arrays.deepToString(intArr)); 
	}

}
