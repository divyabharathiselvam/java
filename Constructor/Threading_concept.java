

//sleep() in Thread
package Langpackages;

public class Threading_concept extends Thread {
public void run(){//must override the run method when Thread class is extended//
	for(int i=0;i<5;i++){
		Thread th=currentThread();
		String str=th.getName();
		
		System.out.println(str+" "+i);
	}try{
		sleep(2000);
	}catch(Exception e){
		
	}
	System.out.println("run");
}
	public static void main(String[] args) {
		
System.out.println("start");
Threading_concept t=new Threading_concept();
t.setName("fast");//used to find the thread object using Thread name//
t.start();
System.out.println();
Threading_concept t1=new Threading_concept();
t1.setName("average");
t1.start();
Threading_concept t2=new Threading_concept();
t2.setName("slow");
t2.start();
System.out.println("end");
	}

}