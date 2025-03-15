package a;

public class day50polymorphismoverriddingpart1 {

	
	void meth1() {
		System.out.println("class a "+10);
	}
	
	void meth2(int a) {
		System.out.println("class a "+a);
	
	}
	
    private void meth3(String s) {
		
		System.out.println("class A"+ s);
	}
    
    protected void meth4() {
    	System.out.println("class A hi");
    }
    
    static void meth5() {
    	
    	System.out.println("class A");
    	
    }
    
    day50polymorphismoverriddingpart1 meth6()
    {
    	
    	System.out.println("class A meth6");
    	return this;
    }
    
}

/*
 * 1) we can't overide a private method 
 * 2) if we cant inherit a method we can't override that method 
 * 3)private < default < protected < public 
 * 4)overridding method should not be more restrictive than the overridden method 
 * 5)static method can't be overridden . it may seem like we are overridding but actually that is method hiding 
 * 6)for co-varient return(java 1.5v) types we can perform oberridding even though we have change the return types.
 * 7)co-varient return types are applicable only for Classes not for primitives 
 * 8)constructors can't be overridden
 * 
 * 
 * 
 * 
 * 
 */



