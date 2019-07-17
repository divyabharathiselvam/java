package Set_List;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set hs=new HashSet();//virtual obj for set
hs.add("earth");
hs.add("world");
hs.add("earth");
hs.add("sunligth");
hs.add("water");
hs.add(676);
hs.add(1234);
System.out.println(hs);//shuffled order //

Set ls=new LinkedHashSet ();
ls.add(123);
ls.add("ashgfdh");
ls.add("davsh");
ls.add(32456);
System.err.println(ls);//insertion order//

Set ts=new TreeSet ();
ts.add(52316);
//ts.add("dgsh");
//ts.add("cfghw");
ts.add(123);
System.out.println(ts);//sorted Order//

	}

}
