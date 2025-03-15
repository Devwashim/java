package a;

public class hday8 {

	
	void 
	meth1() {
		System.out.println("start");
		System.out.println("----------------");
		
		String a1="aman is good boys";
		String a3= a1.toLowerCase();
		String a =new String("KAPIL");
		
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a3.replace("good", "bad"));		
		System.out.println(a3.replace(" ", "_"));	
		
		
		String letter= "dear <|name|>, thank a lot";
		
		letter= letter.replace("<|name|>", "ak");
		System.out.println(letter);
		
		
		
		String sc=new String("this string  content   doubl ");
		System.out.println(sc.indexOf("  "));
		System.out.println(sc.indexOf("   "));
	
		
		
	}
	public static void main(String[] args) {
		
		
		hday8  obj =new hday8();
		obj.meth1();
	}
	
}
