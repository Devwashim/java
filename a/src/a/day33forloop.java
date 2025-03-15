package a;

public class day33forloop {

	
	
	void meth1() {
		
		System.out.println("--------meth1()------------");
		for(int i=1;i<=5;i++) {
			System.out.println(" i value is "+i);
			
		}
		System.out.println("meth1() executed");
		
	}
	
	void meth2() {
		
		System.out.println("------------meth2-----------");
		for(int i=1; i<=10; i++) {
			System.out.println(" i value is "+i);
			i++;
		}
		System.out.println("meth2() executed");

	}
	
	void meth3() {
		System.out.println("------------meth3-----------");

		int i=1;
		for(;i<=10;)
		{
			System.out.println(" i value is "+(++i));
			i++;

		}
	}
	
	void meth4() {
	
		day33forloop obj=new day33forloop();
		
		int i=1;
		for(System.out.println("------------meth2-----------"),System.out.println(obj.meth5());i<=5;obj.meth6())
		{
					System.out.println("i value is "+i);
					i++;
				}
	}
	
	String meth5() {
		System.out.println("meth5() executed");
		return "java is awesome";
		
	}
	
	
	void meth6() {
		System.out.println("--------------");
	}
	
	
	void meth7() {
		
		System.out.println("------------meth7-----------");

		int i=1;
		for(;;) {
			System.out.println("i value is "+i);
			i++;

		}
	}
	
	int meth8() {
		
		System.out.println("meth8() executed");
		return 1;

	}
	
	void meth9() {
		
		System.out.println("------------meth9-----------");

		for(int i=new day33forloop().meth8(); i<=100;i++) {
			System.out.println("i value is "+i);

			System.out.println("meth9() executed");

		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		day33forloop obj=new day33forloop();
		obj.meth1();
		obj.meth2();
		obj.meth3();
		obj.meth4();
//		obj.meth7();
		obj.meth9();
	}
	
	
	
}
