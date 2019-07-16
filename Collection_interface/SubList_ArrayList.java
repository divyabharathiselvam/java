package Collection_interface;

import java.util.*;
import java.util.ArrayList;

public class SubList_ArrayList {

	public static void main(String[] args) {
		try {

			// Creating object of ArrayList<Integer>
			ArrayList<String> arrlist = new ArrayList<String>();

			// Populating arrlist1
			arrlist.add("Asab");
			arrlist.add("Bcdsg");
			arrlist.add("Cdsfv");
			arrlist.add("Ddfvs");
			arrlist.add("Edfv");

			// print arrlist
			System.out.println("Orignal arrlist: " + arrlist);

			// getting the subList
			// using subList() method
			List<String> arrlist2 = arrlist.subList(0, 3);

			// print the subList
			System.out.println("Sublist of arrlist: " + arrlist2);
		}

		catch (IndexOutOfBoundsException e) {
			System.out.println("Exception thrown : " + e);
		}

		catch (IllegalArgumentException e) {
			System.out.println("Exception thrown : " + e);
		}

	}

}
