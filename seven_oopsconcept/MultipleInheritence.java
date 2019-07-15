package seven_oopsconcept;


class match1{
	void start(){
	System.out.println("ind vs southafrica");
}
}
class match2 extends match1{
	void stage1(){
		System.out.println("ind vs pak");
	}
}
interface a{
	void semi1();
}
interface b extends a {
	void semi2();
}
public  class MultipleInheritence  extends match2 implements b{
	public void winner(){
		System.out.println("england -winner 2019");
	}
public void finals(){
	System.out.println("eng vs nzl");
}
public void semi1(){
	System.out.println("ind vs nzl");
}
public void semi2(){
	System.out.println("aus vs eng ");
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritence m=new MultipleInheritence();
		m.finals();
		m.semi2();
		m.semi1();
	    m.stage1();
	    m.start();
	    m.winner();
	}

}