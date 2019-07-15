package Constructor;

	//multiple constructor overloading using this()//

 class Constructor1 {
		Constructor1(){
			super();
		System.out.println("empty");
		}
		public Constructor1(char a){
		//	this();
			System.out.println("char");
		}
		
		private Constructor1(double a){
		this(123);
			System.out.println("float constructor");
		}
		protected Constructor1(int a){
		this('a');
			System.out.println("int Constructor");
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Constructor c=new Constructor();
			
		}

	}
public class Consructor_Super extends  Constructor {
		Consructor_Super(){
			System.out.println("test");
		}
	public static void main(String[] args){
		Consructor_Super ob=new Consructor_Super();
		
	}
}


