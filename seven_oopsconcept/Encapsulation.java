package seven_oopsconcept;

public class Encapsulation {
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
class Enc{
	public static void main(String[] args) {
		 Encapsulation en=new  Encapsulation();
		 en.setId(215);
		 
		 en.setName("teena");
		 
		 int id=en.getId();
		 String name=en.getName();
		System.out.println(id+" "+name);
		
	}
	 
}