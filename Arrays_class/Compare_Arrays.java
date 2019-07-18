package Arrays_class;
import java.util.Arrays;
public class Compare_Arrays {

	public static void main(String[] args) {
		
		      int inarr1[] = {1, 2, 3}; 
		      int inarr2[] = {1, 2, 3};  
		     
		      Object[] arr1 = {inarr1};  // arr1 contains only one element 
		      Object[] arr2 = {inarr2};  // arr2 also contains only one element 
		     // Object[] outarr1 = {arr1}; // outarr1 contains only one element 
		      //Object[] outarr2 = {arr2}; // outarr2 also contains only one element         
		      if (Arrays.deepEquals(arr1,arr2)) 
		          System.out.println("Same"); 
		      else
		          System.out.println("Not same"); 
		    
		      if (Arrays.equals(arr1,arr2)) 
		          System.out.println("Same"); 
		      else
		          System.out.println("Not same"); 
		      
		      int intArr[][] = { { 10, 20, 15, 22, 35 } }; 
		      
		        // Get the second Arrays 
		        int intArr1[][] = { { 10, 15, 22 } }; 
		  
		        // To compare both arrays 
		        System.out.println("Integer Arrays on comparison: "
		                           + Arrays.deepEquals(intArr, intArr1)); 
		      
		      
}}
