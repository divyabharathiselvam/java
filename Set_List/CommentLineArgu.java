package Set_List;
import java.util.*;

public class CommentLineArgu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=0;i<args.length;i++){
	System.out.println(args[2]);
}
List ls=Arrays.asList(args);
//System.out.println(ls);
TreeSet ts=new TreeSet(ls);
System.out.print(ts);
	}

}
