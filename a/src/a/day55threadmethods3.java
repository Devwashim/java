package a;

public class day55threadmethods3 {

	
	public static void main(String[] args)  throws InterruptedException {
		
		
		System.out.print("j");
		Thread.sleep(3000);//milisec
		System.out.print("a");
		Thread.sleep(3000);
		System.out.print("v");
		Thread.sleep(3000);

		System.out.print("a");
		Thread.sleep(3000,500);//milisecnono

	}
}

/*
 * 
 * thread.sleeo() Specified time in milliseconds.
 * thread.sleeo() long milisecs, int nanosec // sepecified.
 *  * 
 */

*/