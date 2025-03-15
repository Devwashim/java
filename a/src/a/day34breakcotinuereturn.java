package a;

public class day34breakcotinuereturn {

	
	void meth()//continue[loop & blocks] break [loops, block, switch,]return[]
	{
		
		
		
		for(int i=1; i<=10;i++) {
		
		if (i==5) {
			
//			break;
//			continue;
			 return;
			
		}
		System.out.println(" i value is "+i);
		
		}
		System.out.println("comppiler come out from the loop");
	}
	
	
	
	public static void main(String[] args) {
		
		day34breakcotinuereturn obj = new day34breakcotinuereturn();
		System.out.println("start");
		obj.meth();
		System.out.println("end");

	}
}
