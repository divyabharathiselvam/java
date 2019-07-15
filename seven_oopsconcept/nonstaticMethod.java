package seven_oopsconcept;

public class nonstaticMethod {
public static int add(int a){
	int s=a;
	
    System.out.println(s);
	return s;
}
public int values(int a,int b){
	int sub=b-a;
	//int add=a+s;
	add(sub);
	return sub;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nonstaticMethod n=new nonstaticMethod();
		n.values(2,5);
	}

}
