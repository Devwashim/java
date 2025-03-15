package a;

public class day53  extends Thread {
	
	
	public void run() {
		
		for(int i=0; i<5; i++) {
			System.out.println("run method executed"+i);
		}
		
		
	}
	
	
	void meth1(){
		
		System.out.println("start");
	}
	
	public static void main(String[] args) {
		
		day53 obj=new day53();
		Thread t= new Thread(obj);
		t.start();
		
		
	}

}
