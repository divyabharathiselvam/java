package collections_class;

import java.util.*;

public class MySyncList {

	public static void main(String a[]) {

		List<String> li = new ArrayList<String>();
		/*
		 * Collections.synchronizedList() method helps to get thread safe list.
		 * Collections.synchronizedList() method Returns a synchronized
		 * (thread-safe) list backed by the specified list.
		 */
		List<String> sysLi = Collections.synchronizedList(li);
		System.out.println("Synchronized list got created..." + sysLi);

		Set<String> ss = new HashSet<String>();
		Set<String> sysSet = Collections.synchronizedSet(ss);
		System.out.println("Synchronized set got created...");

		Map<String, String> mp = new HashMap<String, String>();
		Map<String, String> sysMapt = Collections.synchronizedMap(mp);
		System.out.println("Synchronized map got created...");

	}
}
