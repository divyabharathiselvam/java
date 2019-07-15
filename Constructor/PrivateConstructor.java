package Constructor;
class D{
	 private D(){//private constructor cannot create a obj// 
		int a = 10;
	 }
	 static void go(){//in private constructor method and variable must be static//
		 System.out.println("go");
	 }
	 static int a=100;
}
public class PrivateConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
D.go();
System.out.println(D.a);
	}

}
