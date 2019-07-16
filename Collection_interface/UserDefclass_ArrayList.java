package Collection_interface;
import java.util.ArrayList;
import java.util.*;  
import java.util.Iterator;
class Student{
	int id;
	String name;
	double salary;
	Student(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}

 class UserDefclass_ArrayList {

	public static void main(String[] args) {
	Student s1	=new Student(1,"divya",30000);
	Student s2	=	new Student(2,"meena",25000);
	Student s3	=new Student(3,"monica",32000);
ArrayList<Student> al=new ArrayList<Student>();
al.add(s1);
al.add(s2);
al.add(s3);
Iterator itr=al.iterator();
while(itr.hasNext()){
Student st	=(Student) itr.next();
System.out.println(st.id+st.name+st.salary);
	}}
 }

