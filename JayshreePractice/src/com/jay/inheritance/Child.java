/**
 * 
 */
package com.jay.inheritance;

/**
 * @author spatil28
 *
 */
public class Child extends Parent {

	String name;
	
	public void showClassName() {
		System.out.println("I am Child class");
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
		
		
	}

	public Child(String name , int id) {
		
		super(id);
		
		System.out.println("Child param construct called");
		this.name = name;
		//this.id=id;
	}
	
	public Child() {
		
		System.out.println("Child default construct called");
	}
	
	public void printChild() {
		System.out.println("Name :"+this.name);
		System.out.println("Id:"+this.id);
	}
}
