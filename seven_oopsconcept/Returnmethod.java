package seven_oopsconcept;

public class Returnmethod {
	int a=20;
	int go(){
		int b=22;
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Returnmethod r=new Returnmethod();
		int b=(r.a+r.go());
		System.out.println(b);
	}

}
