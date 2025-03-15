package a;

public class day55p1 {

	
	public static void main(String[] args)throws InterruptedException {
		
		day55 obj=new day55();
		obj.start();
		obj.join();
		for(int i=1;i<=5;i++) {
			System.out.println("class B : " +i);
		}
	}
}


