package Langpackages;

import java.util.Scanner;

public class Scanner_Class extends Exception {
String s;
Scanner_Class(String s){
	this.s=s;
}
public String toString(){
	return s;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("enter the age");
int a=sc.nextInt();
if(a>18){
	System.out.println("valid vote");
}else{
	try{
		throw new Scanner_Class("invalid");
	}catch(Scanner_Class e){
		System.out.println(e);
		e.printStackTrace();
	}
}
	}

}
