package a;

public class day57p1 {

	
	int amount =10000; //instance varibale
	 
	synchronized void with_draw(int amount) throws InterruptedExpection 
	
	
	if(this.amount<amount) {
		
		System.out.println("insufficient balance");
		wait(10000);
		System.out.println("amount creditegdS");
		this.amount-=amount;
		System.out.println("with draw succ \nbalance is" +this.amount);
		
	}
	else
		
	{
		
//		this.amount-=amont
	}