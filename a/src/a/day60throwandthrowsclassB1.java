package a;
import java.util.*;

public class day60throwandthrowsclassB1 {

	
	
	static double current_balance = 100;
	
	
	public static void main(String[] args) throws day60throwandthrowsclassB 
	{
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter amount to withdrowal");
		
		int n = s.nextInt();
		
		try {
			if(current_balance< n) 
			{
	throw new day60throwandthrowsclassB("insufficient fund "+current_balance);
			}else 
			{
				System.out.println("plese take the money "+n);
			}
		}catch(day60throwandthrowsclassB mab)
		{
			mab.printStackTrace();
		}
				
	}
}
