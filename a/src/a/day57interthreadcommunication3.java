package a;

public class day57interthreadcommunication3 extends Thread {

	
	public void run() {
		int i = 0;
		while(true) {
			i=i+1;
			System.out.println("darmon "+i);
		}
	}
	public static void main(String[] args) {
		
		day57interthreadcommunication3 obj =new day57interthreadcommunication3();
		obj.setDaemon(true);
		obj.start();
		
		for(int i=1;i<20; i++) {
			System.out.println("main :"+i);
		}
		System.out.println("end of main");
		
		
	}
}
