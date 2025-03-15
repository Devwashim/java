package a;

public class daya38part2 {
	
	daya38part2(){
		
		this(500);
		this.meth1();
		System.out.println("deafault constructor");
		
	}
	
	daya38part2(int a){
	
	this("java is awasome");
	System.out.println("parameterized constructor:" +a);

}

void meth1() {
	
	System.out.println("meth()");
}
daya38part2(String s)
{
	System.out.println(s);
}

public static void main(String[] args) {
	new daya38part2();
}
}
