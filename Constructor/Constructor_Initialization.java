package Constructor;

public class Constructor_Initialization {
final int a;// cannot declare variable in final variable but using constructor we can initialize/
public  Constructor_Initialization(){
	a=10;
}
	public static void main(String[] args) {
		System.out.println( new Constructor_Initialization().a +10);
		System.out.println( new Constructor_Initialization().a );//final var cannot reassign//
	}

}
