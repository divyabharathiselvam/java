/*package seven;
class Over{
	static int add(int a,int b){
		
		return a+b;
	}
}
public class Overloading extends Over{
public static void add(){
	int a=10;
	int b=20;
	System.out.println (add(a,b));
	//return add();
}
	public static void main(String[] args) {
		
    add();
	}

}*/


//public,static,final method can be overloaded//
package seven_oopsconcept;
class Over{
	void alert(){
		System.out.println("alert");
	}
 final static int add(int a,int b){//static method can be overloading//
		
		return a+b;
	}
}
public class Overloading extends Over{
	public final void alert(){//here final method can be overloading//
		System.out.println("alert1");
	}
public static void add(Overloading obj){
	int a=10;
	int b=20;
	System.out.println (obj.add(a,b));
	//return add();
}
	public static void main(String[] args) {
		Overloading o=new Overloading();
		o.alert();
        add(o);
	}

}

