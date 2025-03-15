package a;

public class day55p2 extends Thread {

	
//	public static void main(String[] args)throws InterruptedException {
//		System.out.print("j");
//		Thread.sleep(3000);//(millisec )
//		System.out.print("a");
//		Thread.sleep(3000);
//
//		System.out.print("v");
//		Thread.sleep(3000,500);
//
//		System.out.print("a");
//		
//
//	}
//}
	
	public void run() {
		
		System.out.println(" i am ready for interviews");
		
		for(int i=1; i<=5; i++){
			System.out.println("this is my "+i+" interview");
		}
		System.out.println("i got palced now i can relax");
		
		try {
			
			Thread.sleep(10000);
		}
		catch(Exception e){
			
			System.out.println(" some disturbed my sleep:");
		}
		System.out.println("time to go office");
		}
	
	
/*
 thread.sleep() // specified time in milliseconds.
 thread.sleep() // long milliseconds, int nanosec.

*/ public static void main(String[] args) {
	
	
	day55p2 obj =new day55p2();
	Thread t=new Thread(obj);
	t.start();
	t.interrupt();
	
	
}	
	
}