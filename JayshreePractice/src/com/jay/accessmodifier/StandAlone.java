/**
 * 
 */
package com.jay.accessmodifier;

/**
 * @author spatil28
 *
 */
public class StandAlone {

	/**
	 * @param args
	 */
	protected int x=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Parent p= new Parent();
   childclass ch = new childclass();
   ch.method();
	}
	}
class childclass extends StandAlone{

	public void method() {
		System.out.println(x);
	}

}
