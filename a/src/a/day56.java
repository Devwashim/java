package a;

public class day56 extends Thread {
	
	public void run()
	{
		
		criticalres();
	}
	synchronized void criticalres()
	{
		
		String name= Thread.currentThread().getName();
		System.out.println( name+ "has entrerd critical resourse");
		for(int i=1; i<=5; i++)
		{
			System.out.println(name+"i value :"+i);
			System.out.println(name+"has completed its exection");
		}
	}
	
	
	public static void main(String[] args) {
	
		
		day56 obj=new day56();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		
		
		
		t1.setName("tom- thread");
		t2.setName("jerry- thread");

		t1.start();
		t2.start();
		
		
		
	}
}
