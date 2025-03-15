package a;

public class day19test {
	
	
	public day19test() {
		
		System.out.println("sunday");
		day19test obj=new day19test(10);
		System.out.println("tuesday");
		String s=obj.display("challange Accepted");
		System.out.println(s);
	}
	
	public day19test(int temp) {
		
		
		System.out.println("saturday");
		new day19test(10,20);
		System.out.println("monday");
	}
	
	String display(String s) {
		System.out.println("in the next statement i am returing String value");
		return s;
		
	}
	
	public day19test(int data,int temp) {
		System.out.println("thursday");
	}
	public static void main(String[] args) {
		day19test obj= new day19test();
		System.out.println("output verified");
	}
	
	
}

//what is  between constructor or method
