package a;

public class day34task {

	
	void display() {
		
		int a = 10;
		for(int k=(a+++new day34task().meth1(5))+(++a+3)+(++a+3);k>10;k++)//11,33,13,13
		{
			System.out.println(k+6);
			break;
		}
		
		
		
	}
	int meth1(int a) {
		return new day34task().meth2(10+1,15-3)+(a*2);//11,12,10
	}
	
	int meth2(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		
		day34task obj = new day34task();
		obj.display();
		
	}
}
