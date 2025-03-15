package a;


public class day57interthreadcommunication  {

	
	int amount =10000;//instance variable
	
	synchronized void with_draw(int amount) throws InterruptedException
	{
	
	if(this.amount<amount)
	{
		System.out.println("insufficient balance");
		wait(50000);
		System.out.println("amount credited");
		this.amount-=amount;
		System.out.println("with drow successful \nBalance is "+this.amount);
	}
	else
	  {
		this.amount-=amount;
		System.out.println("with drow successful \nBlance is "+this.amount);
		
		}

}
    synchronized void deposit(int amount) 
{
	this.amount+=amount;
	System.out.println("deposited successfully \nbalance is "+this.amount);
	notify();
//	notifyAll();
}

}



