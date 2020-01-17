/**
 * 
 */
package com.jay.inheritance;

/**
 * @author spatil28
 *
 */
public class MyAbsractChild extends MyAbstract {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MyAbstract ma= new MyAbsractChild();
				//MyAbstract ma1= new MyAbstract();
			ma.finalMethod();
			ma.nonAbstractMethod();
	}

	/* (non-Javadoc)
	 * @see com.jay.inheritance.MyAbstract#method2()
	 */
	
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Child of abstarct class");
	}

	/* (non-Javadoc)
	 * @see com.jay.inheritance.MyAbstract#abstractMethod()
	 */
	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("abstract method in child");
		
	}
	public int nonAbstractMethod() {
		System.out.println("Non from child");
		int z=2;
		int t=3;
		int r=z+t;
		return r;
	}
	}
