package a;

public class day52 extends day52p2 implements interfaceA,interfaceB
{
	
	public void meth1() 
	{
		System.out.println("start");
		System.out.println("interrface a ");
		
	}
	
	public void show() {
		System.out.println("interfaceB abstract method overridden");
	}
	
	@Override
	public void msg() {
		
		interfaceA.super.msg();
		interfaceB.super.msg();
		}
	
	
	public static void main(String[] args) {
		
		interfaceA obj=new day52();
		obj.meth1();
		obj.meth2();
				
		
		interfaceB bobj = new day52();
		bobj.show();
		
		System.out.println("====================");
		new day52().msg();
		System.out.println("=============");
		new day52().display();
	} 
}
