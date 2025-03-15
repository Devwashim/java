package a;

public class day55threadmethods6  {

	
public static void main(String[] args) {
	
	day55threadmethods5 obj = new day55threadmethods5();
	
	obj.start();
	Thread.yield();
	
	for(int i= 1; i <=5;i++) {
		
		
		System.out.println("classB : "+i);
	}
	
	
}
}
