package a;

public class day56synchronizationanddeadlock extends Thread  {

	
	
	
	public void run() {
		
		meth();
		
	}
	
	synchronized  void meth() {
		
	 String name = Thread.currentThread().getName();
	 System.out.println(name+" has entered critical resourse");
	 
	 for(int i=1;i<=5;i++) {
		 
		 
		 System.out.println(name+"i value "+i);
	 }
	 
	 System.out.println(name+" has completed is execution");
	 
	}
	
	public static void main(String[] args) {
		
		day56synchronizationanddeadlock obj = new day56synchronizationanddeadlock();

		Thread t = new Thread(obj);
		Thread t1 = new Thread(obj);
		
		t.setName("tom thread ");
		t1.setName("jerry thread ");

		t.start();
		t1.start();


	}
}
