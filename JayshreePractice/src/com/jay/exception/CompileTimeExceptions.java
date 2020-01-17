/**
 * 
 */
package com.jay.exception;

/**
 * @author spatil28
 *
 */
public class CompileTimeExceptions {

	public static void main(String[] args) {
		
		mathMethod();
		try {
			checkAccount(0);
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void mathMethod() {
		int c=0;
		try{
			int a=4,b=0;	
		c=a/b;
		}
		catch(ArithmeticException e) {
			//a.printStackTrace();
			System.out.println("Catching Exception");
		}
		System.out.println(c);

	}
	public static void checkAccount(int accountN) throws Exception {
		if(accountN==0) {
			throw new CustomException("My Exception for 0");
			//throw new Exception("tmp");
		}
		if(accountN<0) {
			throw new Exception("My Exception for -ve");
			//throw new Exception("tmp");
		}
		
	}
}
