package a;

public class day1 {
	
	
	void meth2(int a ,int b) {
		
	System.out.println(" a value : " +a);
	System.out.println(" b value : " +b);
	System.out.println(a+1);
	System.out.println(a-61);
	}
	
	public static void main(String[] args) {
		
	System.out.println("start");
	day1 obje= new day1();
	obje.meth2(25,45); //case1
		
	//new day1().meth2(65, 25);// case2  it is not a good pratice//
	}
}
