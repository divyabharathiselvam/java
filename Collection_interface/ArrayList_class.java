package Collection_interface;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection.*;

public class ArrayList_class {

	public static void main(String[] args) {
		List ls = new ArrayList();
		ls.add("sfhasd");
		ls.add(1234);
		ls.add("sadbfh");
		System.out.println(ls);
		
		
		ArrayList al = new ArrayList();// creating old non-generic arraylist //
		ArrayList<String> al1 = new ArrayList<String>();// creating new generic
														// arraylist //
		al.add("divya");
		al.add(23.4);
		al.add(1234567890);
		al.add(al);
		al1.add("collections and arrayList");
		al.addAll(al1);
		System.out.println(al );

	}

}
