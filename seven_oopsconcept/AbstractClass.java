package seven_oopsconcept;
abstract class MSD{
	public abstract void go();
	void good(){
		System.out.println("good");
	}
}
public class AbstractClass extends MSD {
	public void go(){
		System.out.println("go");
	}
	void good(){
		System.out.println("good111");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass a=new AbstractClass();
		a.go();
		a.good();

	}

}
