package a;

public class day32task2 {

	int c;
	static int e ;
	day32task2(){
		
		System.out.println(++c);
		System.out.println(++e);
	}
	public static void main(String[] args) {
		int a=34;
		int b =21;
		new day32task2().c =a++ + ++b ;
		int d=--a + --b + new day32task2().c--;
		e=a + +b + +new day32task2().c+ d--;
		int f =-a +b--- + -new day32task2().c - d++;
		int sum = a+b + new day32task2().c+d+e+f;
		System.out.println("sum="+sum);
	}
}
