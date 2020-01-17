/**
 * 
 */
package Threads;

/**
 * @author spatil28
 *
 */
public class ThreadSample {

	public static void main(String args[]) throws InterruptedException {
	Thread t1 = new Thread(new ThreadA());
	Thread t2 = new Thread(new ThreadA());
	  System.out.println("Starting threads");
	
	  
	
	  
	
	}
	  
	
	public synchronized  void showSquare() {
		System.out.println(" Showing square");
	}
	public synchronized  void showCircle() {
		System.out.println(" Showing circle");
	}
	
}
