package alison;

public class pointCoodinates {

	
	
	private int x,y;
	
	
	public pointCoodinates(int x, int y) {
		
		this.x=x;
		this.y=y;
		
	}
	
	public int getX() {
		
		return x;
	}
	public int getY() {
		
		return y;
	}
	
	



	
	public static void main(String[] args) {
		pointCoodinates point = new pointCoodinates(10,10);
		
//		using the default object.toString methiod
		
		System.out.println("object to string "+point);
		
		//implicity call toString on object  as part of string concatentions
		String s = point +" tested";
		System.out.println(s);
		
	}
}
