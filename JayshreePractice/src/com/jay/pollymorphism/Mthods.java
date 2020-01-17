/**
 * 
 */
package com.jay.pollymorphism;

import com.jay.accessmodifier.Parent;

/**
 * @author spatil28
 *
 */
public class Mthods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p = new Parent();
		
		
		String str = "Jayshree";
		method1(5,"sagar");
		method1(6,str);
		method1(6,new String("Shrey"));
		method1(7,method2());
	}
	
	public static void method1(int a,String b) {
		
		System.out.println("Method1 called");
		System.out.println("int a :"+a+" String b :"+b);
		
		
		
	}
	public static int method3() {
		System.out.println("Method3 called");
		return 10;
	}
	
	public static String method2() {
		System.out.println("Method 2 called :");
		method3();
		return "method2";
	}

}
