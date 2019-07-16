package Collection_interface;

import java.util.ArrayList;

public class Size_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("saf");
		arrlist.add("dba");
		arrlist.add("sadgytu");
		System.out.println("Before operation: " + arrlist);
		int size = arrlist.size();
		System.out.println("Size of list = " + size);
	}

}
