package a;

public class day27arraycollectionframework {

	//autoboxing
	
void meth1() {
	int i=100;
	
	Integer ivall = Integer.valueOf(i);
	
	System.out.println("int PDT value : "+i);
	System.out.println("interger WCO Value "+ivall);
	System.out.println("------------------");
	
	byte b =50;
	Byte ivall1 = Byte.valueOf(b);
	System.out.println("int PDT value : "+b);
	System.out.println("interger WCO Value "+ivall1);
	System.out.println("------------------");

	
	
	Integer ivall3 = Integer.valueOf(500);
	
	Byte ivall2= Byte.valueOf((byte)20);

	System.out.println("interger WCO Value "+ivall3);
	System.out.println("Byte WCO Value "+ivall2);


}
public static void main(String[] args) {
	new day27arraycollectionframework().meth1();
}
	
	
	
}
