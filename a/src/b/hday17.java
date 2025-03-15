package b;

public class hday17 {
	
	void meth1(int n) {
		
		System.out.println("start");
		
		for(int i=1; i<=10;i++) {
			
			System.out.format("%d X %d =%d\n",n,i, n*i);
			
		}
	}
		
		//q2
	
	static void patten(int n) {
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<i+1;j++) {
				System.out.print("*");
				
				
			}
			
			System.out.println();
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		hday17 obj= new hday17();
		obj.meth1(5);
		patten(4);
	}

}
