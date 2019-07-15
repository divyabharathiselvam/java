/*package seven;

public class ClassAsParameter {
void go(ClassAsParameter obj){
	System.out.println(obj);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassAsParameter c=new ClassAsParameter ();
		c.go(c);
	}

}*/
//class as parameter using one object//
package seven_oopsconcept;

public class ClassAsParameter {
	void go1(){
		System.out.println("go1");
	}
	void go2(){
		System.out.println("go2");
	}
void go(ClassAsParameter obj){
	System.out.println("class return obj"+obj);
	obj.go1();
	obj.go2();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassAsParameter c=new ClassAsParameter ();
		c.go(c);
	}

}
