/**
 * 
 */
package com.jay.inheritance;

/**
 * @author spatil28
 *
 */
public class Parent {

	int id;
	Parent(){
		System.out.println("Parent default construct called");
	}
	Parent(int id){
		System.out.println("Parent prams construct called");
		this.id=id;
	}
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public void printParent() {
		System.out.println("Id :"+this.id);
	}
	
	public void showClassName() {
		System.out.println("I am parent class");
	}
}
