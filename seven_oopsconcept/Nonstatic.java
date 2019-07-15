package seven_oopsconcept;

public class Nonstatic {
public int a=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nonstatic n=new Nonstatic();
		int b=n.a+200;
		System.out.println(n.a);

	}

}
