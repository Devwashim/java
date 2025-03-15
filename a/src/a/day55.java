package a;

public class day55  extends Thread{

	public void meth1() {
	System.out.println("start");
	System.out.println("========");
	
	
		
	}
	
	public void run() {
		for(int i=1; i<=5;i++) {
			System.out.println("class A :" +i);
		}
		}
	
	 public static void main(String[] args) {
		
		 day55 obj=new day55();
		 obj.meth1();
	}
}
