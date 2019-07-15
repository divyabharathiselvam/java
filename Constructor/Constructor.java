package Constructor;//multiple constructor overloading using this()//

public class Constructor {
	Constructor(){
		this(20.4);
	System.out.println("empty");
	}
	public Constructor(char a){
	//	this();
		System.out.println("char");
	}
	
	private Constructor(double a){
	this(123);
		System.out.println("float constructor");
	}
	protected Constructor(int a){
	this('a');
		System.out.println("int Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c=new Constructor();
		
	}

}
