package a;

public class day31test {

	
	
	void meth3(char Opertor ,int a,int b ) {
		
		
		
		switch(Opertor) {
		
		case '+':
			System.out.println("addition :"+(a+b));
			break;
		
		case '-':
			System.out.println("substraction :"+(a-b));
			break;
			
		case '/':
			System.out.println("division :"+(a/b));
			break;
			
		case '*':
			System.out.println("multiplication :"+(a*b));
			break;
			
			
		}
	}
	
	
		
    void meth2(int unit){
    	
    	int bill=unit*100;
 
    	if(bill>=1000) {
    		
    		int discount =(bill/100)*10;
    		System.out.println("your final bill " +(bill-discount));
    		System.out.println("congratulations you have saved "+discount+ " on you final bill");
    	}
    	
    	
    	else {
    		System.out.println("your final bill is "+bill);
    	}
    	
    	
    }
	
	void meth1(int a) {
		
		int  puchasedquantity = a;
		
		int discont =10;
		
		int oneunitcost = 100;
//		
		int usercost = puchasedquantity/100*discont;
		int total= usercost-puchasedquantity;
		
			System.out.println("one user cost is :"+(puchasedquantity/100)*discont);
			System.out.println("total one user cost is :"+total);
			
		
		
	}
	public static void main(String[] args) {
		
		day31test obj=new day31test();
		
//		obj.meth1(1000);
//		obj.meth2(12);
		obj.meth3('*', 10,20);
	}
}
