package alison;

public class myStringbuilder1 {

	
public static void main(String[]args) {
	
	
	StringBuilder dc = new StringBuilder("hello ");
//	dc.append("java");
//	dc.insert(1,"java");
	dc.replace(1,3,"java");
	
	System.out.println(dc);
}
}
