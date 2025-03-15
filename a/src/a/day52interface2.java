package a;

public interface day52interface2 {

	void show();
	
	default void msg() 
	{
		System.out.println("i am from interface B");
	}
}
