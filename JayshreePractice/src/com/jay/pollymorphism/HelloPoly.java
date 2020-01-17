/**
 * 
 */
package com.jay.pollymorphism;

/**
 * @author spatil28
 *
 */
public class HelloPoly {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 HelloPoly h=new OverringClass();
	 h.print("Ram");

	}
public void print(String name) {
	System.out.println("Parent Print");
	System.out.println("Name is:"+name);
}

}
