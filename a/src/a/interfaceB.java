package a;

public interface interfaceB {
	
	void show();
	
	default void msg()
	{
		System.out.println("i am from interface B");
	}

}
