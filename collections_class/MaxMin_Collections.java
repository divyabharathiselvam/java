package collections_class;
//How to get max element of a list of user defined objects?

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Empl implements Comparable<Empl> {

	private int id;
	private String name;
	private Integer salary;

	public Empl(int id, String name, Integer sal) {
		this.id = id;
		this.name = name;
		this.salary = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Empl emp) {

		return this.salary.compareTo(emp.getSalary());
	}

	public String toString() {
		return id + "  " + name + "   " + salary;
	}

}

public class MaxMin_Collections {

	public static void main(String a[]) {
		List<Empl> emps = new ArrayList<Empl>();
		emps.add(new Empl(10, "Raghu", 25000));
		emps.add(new Empl(120, "Krish", 45000));
		emps.add(new Empl(210, "John", 140000));
		emps.add(new Empl(150, "Kishore", 24000));
		Empl maxSal = Collections.max(emps);
		Empl minSal = Collections.min(emps);
		System.out.println("Employee with min salary: " + minSal);
		System.out.println("Employee with max salary: " + maxSal);
		/*
		 * List<Integer> li = new ArrayList<Integer>(); li.add(23); li.add(44);
		 * li.add(12); li.add(45); li.add(2); li.add(16); System.out.println(
		 * "Minimum element from the list: "+Collections.min(li));
		 * System.out.println("Maximum element from the list: "
		 * +Collections.max(li));
		 */
	}
}
