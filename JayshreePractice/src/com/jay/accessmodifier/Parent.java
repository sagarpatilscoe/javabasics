/**
 * 
 */
package com.jay.accessmodifier;

/**
 * @author spatil28
 *
 */
public class Parent {

	public String publicStr;
	private String privateStr;
	String defaultStr;
	protected String protectStr;
	
	Parent(String s){
		
		
	}
	public Parent(){
		
	}
	public static void main(String args[]) {
		Parent p = new Parent();
		p.parentMethod();
		
	}
	public void parentMethod() {
		
		System.out.println("Parent Method");
	}
}
