package Filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		
File f=new File("D:\\testout1.txt");
//boolean b=f.mkdirs();
f.createNewFile();
FileWriter fw=new FileWriter(f,true);
System.out.println("enter the string");
Scanner n=new Scanner(System.in);
String str=n.nextLine();
fw.write(str);
fw.flush();
fw.close();
	System.out.println("fileWriter");
	}

}


/*
package  Filehandling;  
import java.io.FileWriter;  
public class FileHandling {  
    public static void main(String args[]){    
         try{    
           FileWriter fw=new FileWriter("D:\\testout.txt");    
           fw.write("Welcome to javaTpoint.");    
           fw.close();    
          }catch(Exception e){
          System.out.println(e);}    
          System.out.println("Success...");    
     }    
}  
*/