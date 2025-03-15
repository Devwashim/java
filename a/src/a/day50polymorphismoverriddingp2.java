package a;

public class day50polymorphismoverriddingp2  extends day50polymorphismoverridding{

	
	void meth1(int x ,int y) {
		
		
		System.out.println("class b method ");
		System.out.println("subratations"+ (x-y));
		
	}
	
	public static void main(String[] args) {
		
		day50polymorphismoverridding obj = new day50polymorphismoverriddingp2();
		obj.meth1(40, 60);
		
		
		System.out.println("=============");
		day50polymorphismoverridding obj1 = new day50polymorphismoverridding();
		obj1.meth1(40,60);
	}
}
