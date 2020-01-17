package com.sample.model;
/**
 * 
 */

/**
 * @author spatil28
 *
 */
public class SampleDataType {
		
	int default_i;
	public int public_j;
	private  String private_s;
	protected double protected_d;
	
	
	
	
	
	/**
	 * @return the default_i
	 */
	public int getDefault_i() {
		return default_i;
	}

	/**
	 * @param default_i the default_i to set
	 */
	public void setDefault_i(int default_i) {
		this.default_i = default_i;
	}

	/**
	 * @return the public_j
	 */
	public int getPublic_j() {
		return public_j;
	}

	/**
	 * @param public_j the public_j to set
	 */
	public void setPublic_j(int public_j) {
		this.public_j = public_j;
	}

	/**
	 * @return the private_s
	 */
	public String getPrivate_s() {
		return private_s;
	}

	/**
	 * @param private_s the private_s to set
	 */
	public void setPrivate_s(String private_s) {
		this.private_s = private_s;
	}

	/**
	 * @return the protected_d
	 */
	public double getProtected_d() {
		return protected_d;
	}

	/**
	 * @param protected_d the protected_d to set
	 */
	public void setProtected_d(double protected_d) {
		this.protected_d = protected_d;
	}

	public static void main(String[] args) {
		SampleDataType sd= new SampleDataType();
		
		
		System.out.println(sd.getDefault_i());
		System.out.println(sd.getPrivate_s());
		System.out.println(sd.getProtected_d());
		System.out.println(sd.getPublic_j());

	}

	public void publicMethod() {
		System.out.println("This is Public");
	}
	protected void protectedMethod() {
		System.out.println("This is Protected");
	}
	void defaultMethod() {
		System.out.println("This is Default");
	}
	private void privateMethod() {
		System.out.println("This is Private");
	}


}
