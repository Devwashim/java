package a;

public class day54 implements Runnable {

	public void run() {
		String name=Thread.currentThread().getName();
		int priority=Thread.currentThread().getPriority();
		for(int i=1;i<5;i++) {
			System.out.println(name +"("+priority+")"+"has exexuted run()"+i);
		}
	}
	
	void meth1() {
		
		
		System.out.println("iiiiiii");
		
	}
	
	
public static void main(String[] args) {
	
	day54 n = new day54();
	n.meth1();
	
	Thread t1=new Thread(n);
	Thread t2=new Thread(n);
	
	t1.setName("first-Thread");
	t2.setName("second-Thread");
	
	t1.setPriority(1);
	t2.setPriority(10);
	
	t1.start();
	t2.start();
	
	
	/*thread schedular is goiing to decide which thread should be excuting 1st 
	 * 2)thread schedular will take decesion basing upon two aspects 
	 * ====> thread priorites 
	 * ===>underlying os +hardware
	 * 
	 * thread priorites	
	 * 1)thread pirorities varies between  1 to 10
	 * normal/default priorty is 10
	 *  
	 *  
	 *  */ 
	
}
	
}
