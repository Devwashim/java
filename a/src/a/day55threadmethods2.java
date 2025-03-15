package a;

public class day55threadmethods2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		day55threadmethods obj = new day55threadmethods();
		obj.start();
		obj.join();
		
		for(int i =1; i<=5;i++) {
			
			System.out.println("classB :"+i);
			
		}

		
	}
	
}
