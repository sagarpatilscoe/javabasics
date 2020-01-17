/**
 * 
 */
package com.jay.inheritance;

/**
 * @author spatil28
 *
 */
public abstract class MyAbstract {
	//abstract int i;
	static int a;
	final int o=5;
	public float f;


//public static void main(String [] args) {
//	MyAbstract my = new MyAbstract(4) ;
//	int in=my.method1();
//	System.out.println(in);
//}

public int nonAbstractMethod() {
	System.out.println("Parent Non Absract");
	int z=2;
	int t=3;
	int r=z+t;
	return r;
}
public final void finalMethod() {
	System.out.println("Final method");
}
public final void finalMethod(int s) {
	System.out.println(s);
}
public abstract void abstractMethod() ;

	
}
