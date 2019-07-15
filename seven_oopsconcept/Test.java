package seven_oopsconcept;

public class Test {
public void go(){
	System.out.println("divya");
}
public void gone(){
	System.out.println("hai");
	
}
public static void good(){
	Test t1=new Test();
	t1.gone();
	System.out.println("good morning");
	t1.go();
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
good();
	}

}
