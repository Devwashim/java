package a;

public class day54thread  implements Runnable{

	
	public void run() {
		
		String name= Thread.currentThread().getName();
		int priority= Thread.currentThread().getPriority();
		
		for(int i = 1;i<=5;i++) {
			
			System.out.println(name+"("+priority+")"+"has executed run() : "+i);
		}
		
		
	}
	
	public static void main(String[] args) {
		
		
		day54thread obj = new day54thread();
		
		Thread t = new Thread(obj);
		Thread t1 = new Thread(obj);
		
		 t.setName("first thread");
		 t1.setName("first thread");
		 
		 t.setPriority(1);
		 t.setPriority(10);
		 
		 t.start();
		 t1.start();
		
	}
}


/*
 *
 * 
 * 
 * thread scheduler :
 * 1) thread Scheduler is going to decide which thread should be eccuting 1st 
 * 2)Thread Scheduler will take decision basing upon Two aspects
 * 
 * = thread priorities 
 * ==== underlying OS + HARDWARE
 * 
 * THREAD PRIORITIES :
 * ----------
 * 1) thread priorities varies between to 10 
 * =====> minimum priority is 1 
 * ======> normal / default priorities is 5
 * =======> maximum priority is 10
 * 
 */
