package a;

public class day30swichcase {

	
	void meth1() {
		day30swichcase obj = new day30swichcase();
		
		int i=65;
		byte b=30;
		final int x =40;
		System.out.println("implementing switch case");
		switch(b+10)
		{
		
		default:
			System.out.println("default case executed");
		break;
		
		case 10+90:
			System.out.println("case value is 10");
		break;
		
		case 'A':
			System.out.println("int & char both are compatable data types");
		break;
		
		case 300:
			System.out.println("case value is 300");
		break;
		
		case x:
			System.out.println("case value is 40");
			
			
			if(i=='B') {
				System.err.println("if block exucted");
				obj.meth2();
			}
			else {
				
				System.out.println("else block excuted");
				obj.meth3();
			}
			break;

		}
		System.out.println("comiler came out from the switch");	
	}
	
	void meth2() {
		System.out.println("meth2() called");
	}
	void meth3() {
		System.out.println("meth3() called");
	}
	public static void main(String[] args) {
		
		new day30swichcase().meth1();
	}
}
