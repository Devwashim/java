package a;

public class day61clonemethodandfinalkeywordclassC {

	
	public static void main(String[] args) throws Exception {
		
		day61clonemethodandfinalkeywordclassA obj = new day61clonemethodandfinalkeywordclassA();
		System.out.println(obj.a+ ""+obj.b);
		day61clonemethodandfinalkeywordclassA obj2=obj;
		obj2.b=99;
		System.out.println(obj.a+""+obj.b+"<===>"+obj2.b);
		
		System.out.println("===================");
		
	
		
		day61clonemethodandfinalkeywordclassB bj = new day61clonemethodandfinalkeywordclassB();
		System.out.println(bj.x+" "+bj.y);
		day61clonemethodandfinalkeywordclassB bj2=bj.meth1();
		 bj2.y=99;
		 System.out.println(bj.x+""+bj.y+"<====>"+bj2.y);
	}
}
