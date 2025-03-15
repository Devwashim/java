package a;
import java.io.FileReader;

public class day60throwandthrowsclassA
{

	
	int avl_amount= 10000;
	void with_drow(int wd_amt)
	{
		
		if(avl_amount<=wd_amt) 
		{
			System.out.println("teansaction failed");
			throw new ArithmeticException("insufficient funds");
		}
		else
		{
			System.out.println("TRANCTION SUCCESS");
		}
	}
	void fileoperations() throws Exception
	{
		
		FileReader fr = new FileReader("C:\\Users\\washi\\OneDrive\\Desktop\\tmm");
				System.out.println("hello");
	}
	
	public static void main(String[] args) throws Exception
	{
		
		day60throwandthrowsclassA obj = new day60throwandthrowsclassA();
//		obj.with_drow(5000);
		obj.fileoperations();
	}
}
