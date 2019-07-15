

package seven_oopsconcept;

class Encapsulation1 {
private String name;
private int id;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

}
public class Enc1{
	public static void main(String[] args) {
		 Encapsulation1 en=new  Encapsulation1();
		 en.setId(215);
		 
		 en.setName("teena");
		 
		 int id=en.getId();
		 String name=en.getName();
		System.out.println(id+" "+name);
		
	}
	 
}