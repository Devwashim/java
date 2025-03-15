package a;

public class day57interthreadcommunication2
{	
	public static void main(String[] args)
	{
		
		day57interthreadcommunication obj = new day57interthreadcommunication();
				new Thread()
				{
			public void run() 
			{
				try
				
				{
					obj.with_draw(15000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
				}.start();
				new Thread()
				{
					public void run() 
					{
						obj.deposit(10000);
					}
				}.start();
	}
}
