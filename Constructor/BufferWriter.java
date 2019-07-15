package Filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferWriter {

	public BufferWriter(FileWriter fw) {
		// TODO Auto-generated constructor stub
	}

	public BufferWriter(File f, boolean b) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
File f= new File("D:\\testout2.txt");
FileWriter fw=new FileWriter(f,true);
BufferWriter bw=new BufferWriter(f,true);
FileReader fr=new FileReader(f);
BufferedReader br=new BufferedReader(fr);
System.out.println("enter the string");
String bstr=br.readLine();
//Scanner n=new Scanner(System.in);
//String str=n.nextLine();
//fw.write(str);
fw.flush();
//bw.write("softcrylic");
System.out.println("go1");
bw.close();}

	private void close() {
		// TODO Auto-generated method stub
		
	}

	private void write(String string) {
		// TODO Auto-generated method stub
		
	}
	


}
