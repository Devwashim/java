package a;

public class day56synchronizationanddeadlockClassB extends Thread {

	public void run() {
	
	 String name = Thread.currentThread().getName();
	 synchronized(this) {
		 
		 System.out.println(name+" has entered critical resourse");
		 
		 for(int i=1;i<=5;i++) {
			 
			 
			 System.out.println(name+"i value "+i);
		 }
		 
		 System.out.println(name+" has completed is execution");
		 
		}

	 }
	public static void main(String[] args) {
		
		day56synchronizationanddeadlockClassB  obj = new day56synchronizationanddeadlockClassB();
		Thread t = new Thread(obj);
		Thread t1 = new Thread(obj);
		
		t.setName("first thread ");
		t1.setName("second thread ");

		t.start();
		t1.start();

	}

}
