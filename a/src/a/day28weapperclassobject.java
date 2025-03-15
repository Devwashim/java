package a;

public class day28weapperclassobject {


	
	@SuppressWarnings("removal")
	void meth1() {
		
		
		Integer ivall =new Integer(100);
		Integer ival2 = Integer.valueOf(200);
		Integer ival3 = new Integer("300");
		
		int i1=ivall.intValue();
		int i2=ival2.intValue();//auto-unboxxing
		int i3=ival3.intValue();
		
		System.out.println("integer WCO :"+ivall);
		System.out.println("integer WCO :"+ival2);
		System.out.println("integer WCO :"+ival3);
		
		System.out.println("--------------");
		System.out.println("int PDT :"+i1);
		System.out.println("int PDT :"+i2);
		System.out.println("int PDT :"+i3);
		
		System.out.println("--------------");
		
		
		Byte bval= new Byte((byte)50);
		byte b= bval.byteValue();
		System.out.println("Byte WCO :"+bval);
		System.out.println("byte PDT :"+b);
		System.out.println("------------");
		
		Character cval=new Character('A');
		char c=cval.charValue();
		System.out.println("Character WCO :"+cval);
		System.out.println("char PDT :"+c);
		System.out.println("----------");
		
		Boolean flagval=new Boolean("java");
		Boolean flag=flagval.booleanValue();
		System.out.println("Character WCO :"+flagval);
		System.out.println("char PDT :"+flag);
		System.out.println("----------");

				
	}
	public static void main(String[] args) {
		
		new day28weapperclassobject().meth1();
	}
}
