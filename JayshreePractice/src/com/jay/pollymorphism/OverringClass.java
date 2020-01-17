/**
 * 
 */
package com.jay.pollymorphism;

/**
 * @author spatil28
 *
 */
public class OverringClass extends HelloPoly {

	public void print(String name,int number) {
		System.out.println("OverrdingName is:"+name);
	}
	public void print(String name) {
		super.print(name);
		System.out.println("Child Print");
		System.out.println("Name is:"+name);
	}

}
