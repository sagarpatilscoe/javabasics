package com.practice.lambda;

/**
 * @author MikeW
 */
public class RunnableTest {
  public static void main(String[] args) throws InterruptedException {
    
    System.out.println("=== RunnableTest ===");
    
    // Anonymous Runnable
    Runnable r1 = new Runnable(){
      
      @Override
      public void run(){
    	
    		  System.out.println("Hello world one! R1");
    		//  wait(300);
			  
		
     
      }
    };
    
    // Lambda Runnable
    Runnable r2 = () -> System.out.println("Hello world two! R2");
    
    // Run em!
    System.out.println("Without Thread");
    r1.run();
    r2.run();
    System.out.println("With Thread");
    Thread t1 = new Thread(r1);
    Thread t2 = new Thread(r2);
    t1.start();
    t1.sleep(300);
  //  t1.join();
    //Thread.sleep(300);
    t1.yield();
   
    t2.start();
    
    
    
    
    
    
  }
}
