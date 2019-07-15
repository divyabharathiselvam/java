package seven_oopsconcept;
class Over1{
	public void go(){
		System.out.println("go1");
	}
	protected void good(){
		System.out.println("good1");
	}
}
public class Overriding extends Over1{
public void go(){
	System.out.println("CLEARTHEPAST ");
}
public void good(){
	System.out.println("UPDATETHENEWVERSION");
}
	public static void main(String[] args) {
		Overriding o=new Overriding();
		o.go();
		o.good();

	}

}
