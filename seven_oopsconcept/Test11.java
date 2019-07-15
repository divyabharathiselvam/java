package seven_oopsconcept;
interface Data1 {
	public static int a=10;
	void go();
	}
public class Test11 implements  Data1{
		public void go(){
			System.out.println("process");
		}
		public static void main(String[] args) {
		Data1 t= new Test11();
			t.go();
			System.out.println(t.a);
		}
	}

