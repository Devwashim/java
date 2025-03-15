package a;

public class day55threadmethods4  extends Thread {
	
	
	
	public void run() {
		
		
		System.out.println("i am ready for interviews");
		
		for(int i=1; i<=5; i++) {
			
			System.out.println("this is my "+i+"interview");
		}
		
		System.out.println("i got placed, now i can relax");
		try {
			Thread.sleep(10000);
		}
		catch(Exception e) {
			System.out.println("someone disturbed my sleep");
		}
		
		System.out.println("time to go to office");
	}
	
	public static void main(String[] args) {
		
		
		day55threadmethods4 obj = new day55threadmethods4();
		Thread t = new Thread(obj);
		t.start();
		t.interrupt();
		
		
		
	}

}
