package seven_oopsconcept;
class Creation{
	public void go(){
		System.out.println("hello");
	}
	public void good(){
		System.out.println("welcome");
	}
}
public class VirtualCreation extends Creation {
	public void go(){
		System.out.println("hello11");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Creation c=new VirtualCreation();//virtual class creation//
		c.go();
		c.good();
	}

}
