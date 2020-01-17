/**
 * 
 */
package com.jay.inheritance;

/**
 * @author spatil28
 *
 */
public class InheritanceCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Child ch=new Child();
		System.out.println("Child Class");
		ch.printChild();
		System.out.println("Parent Class");
		ch.printParent();
		System.out.println("**********************");
		Child ch1 =new Child("Sagar", 123);
		System.out.println("Child Class");
		ch1.printChild();
		System.out.println("Parent Class");
		ch1.printParent();*/
		
		Parent p = new Parent();
		Parent c =  new Child();
		
		
		System.out.println("Parent ref/Parent instance");
		p.showClassName();
		
		//Child c = new Child();
		System.out.println("Child ref/Child instance");
		c.showClassName();
		
		Parent p1 = new Child();
		System.out.println("Parent ref/Child instance");
		p1.showClassName();
		
		
		
	}
	public final void finalMethod() {
		
	}

}
