package a;

public class day52interfaceclassA  extends day52interfaceclassB implements day52interface1,day52interface2
{
	
	public void meth1() {
		System.out.println("interfaceA abstract method overridden");
	}
	
	public void show() {
		System.out.println("interfceB abreact method overridden");
	}
	
	@Override
	public void msg() {
		day52interface1.super.msg();
		day52interface2.super.msg();
		
	}
	
	public static void main(String[] args) {
		day52interface1 obj = new day52interfaceclassA();
		obj.meth1();
		obj.meth2();
		
		
		
		day52interface2 obj1 = new day52interfaceclassA();
		obj1.show();

		
		
		System.out.println("------------------");
		
		new day52interfaceclassA().msg();
		
		System.out.println("------------------");
		
		new day52interfaceclassA().display();

	}

	
	
	
	
	
	
}
