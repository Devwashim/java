package a;

public class hday7 {
	
	void meth1() {
		
		
System.out.println("start");
System.out.println("------------------");




String a = "aman";

//int v = a.length();
//String v1= a.toLowerCase();
//
//String v2 = a.toUpperCase();
//String v3 = a.trim();
//System.out.println(v);
//System.out.println(v1);
//System.out.println(v2);
//System.out.println(v3);
System.out.println(a.substring(1,3));

System.out.println(a.replace("a", "k"));


//System.out.println(a.startsWith("am"));
//System.out.println(a.endsWith("d"));

//System.out.println(a.charAt(3));
//System.out.println(a.indexOf("n"));//first index 
//System.out.println(a.lastIndexOf("m"));//first index 
//System.out.println(a.equals("aman"));//first index 

System.out.println(a.equalsIgnoreCase("aMan"));//first index 


//Escape sequence


System.out.println("what upgoing on \"are you  there");
System.out.println("what upgoing on :\n are you  there");
System.out.println("what upgoing on :\t are you  there");
System.out.println("what upgoing on :\\ are you  there");
System.out.println("what upgoing on :\f are you  there");
System.out.println("what upgoing on :\b are you  there");
System.out.println("what upgoing on :\r are you  there");





//String sa =new String("ankt");



//System.out.println(a);
//System.out.println(sa);
		
	}
	
	public static void main(String[] args) {
		
		
		hday7 obj =new hday7();
		obj.meth1();
		
	}

}
