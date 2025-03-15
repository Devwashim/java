package a;

public class daya6 {

//	
//public String makeabba(String a,String b ) {
//	
//	return  a+b+b+a;
	

	public String makeabba(String out,String word ) {
		return  out.substring(0,2)+word+out.substring(2);
	
	}
//
//		
////		return "make Abba " .concat(a).concat(b);
//
//}
public static void main(String[] args) {
//
	
//	
////daya6 obj = new daya6();
////String re=obj.makeabba("hi ","Bye ");
////System.out.println(re);
	

	daya6 obj = new daya6();
	String re=obj.makeabba("<<>> ","king ");
	System.out.println(re);
//
}


}