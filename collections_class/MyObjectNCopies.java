//How to create multiple copies of a given object?
package collections_class;
import java.util.*;
class Emps1{
    
    private int id;
    private String name;
    private Integer salary;
     
    public Emps1(int id, String name, Integer sal){
        this.id = id;
        this.name = name;
        this.salary = sal;
    }
     
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getSalary() {
        return salary;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    public String toString(){
        return id+"  "+name+"   "+salary;
    }
}


public class MyObjectNCopies {
	   public static void main(String a[]){
	         
	        String temp = "Java";
	        List<String> tempCopies = Collections.nCopies(5, temp);
	        System.out.println(tempCopies);
	        Emps1 emp = new Emps1(10, "Raghu", 25000);
	        List<Emps1> empCopies = Collections.nCopies(5, emp);
	        for(Emps1 e:empCopies){
	            System.out.println(e);
	        }
	    }
}
