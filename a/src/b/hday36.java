package b;

class ek{
			
	int a;
	
	public int getA() {
		return a;
	}
	ek(int v){
		a=v;
	}
	public int returnone(){
		return 1;
	}
}

class doo extends ek{
	doo(int c){
		super(c);
		System.out.println("mai ek hoon");
	}
}

public class hday36 {
	public static void main(String[] args) {
		ek a =new ek(5);
		System.out.println(a.getA());
		
		doo b =new doo(10);
		System.out.println(b);
		
	}
	
	

}
