package b;

class base{
	
base(){
	System.out.println( "i am a constructor  base");
}
base(int y){
	System.out.println( "i am a overloaded constructor  base value of y = "+ y);
}


	int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
}


class drive extends base {
	int y;
	drive(){
		//super(0);
		System.out.println( "i am a constructor  drive");

	}
	drive(int a, int b){
		super(a);
		System.out.println( "i am a overloaded constructor  drive =  "+b);
		
	}

	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}


public class hday35 {

	public static void main(String[] args) {
//		base b=new base();
//		drive d =new drive();
		drive d1 =new drive(4,5);
		
		
	}
		
}
