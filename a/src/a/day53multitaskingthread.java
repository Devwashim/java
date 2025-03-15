package a;

public class day53multitaskingthread extends Thread 
{
	public void run() {
		
		for(int i=0;i<=5;i++) {
			
			System.out.println("run method "+i);
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		day53multitaskingthread obj = new day53multitaskingthread();
		
		Thread obj1= new Thread(obj);
		
		obj1.start();
		
//		obj1.run();
		
		Thread obj2 = new Thread();
		obj2.run();
	}

}



/*
obj1.start()

A new thread will not be created which is responsible for running 
the run() present in thread class



obj1.run()

a new thread will not be created we are calling run() just like a normal method call which will ececute CLASSA run()
because we are Overridding 


obj2.run()


A new thread will not be created we are calling run() just like normal method call. thread class run() will be executed


*/