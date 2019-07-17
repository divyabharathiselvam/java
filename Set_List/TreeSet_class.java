package Set_List;
import java.util.List;
import java.util.TreeSet;
import java.util.Arrays;

public class TreeSet_class {

	public static void main(String[] args) {
    int a[]={2,3,1,4,67,88,23};
    Integer x[]=new Integer[a.length];
    
    	
   for(int i=0;i<a.length;i++)
   x[i]= Integer.valueOf(a.length);
   List ls=(List) Arrays.asList(x);
    System.out.println(ls);
    TreeSet ts=new TreeSet(ls);
    System.out.println(ts);
   // List l=Arrays.asList(y);
	}

}
