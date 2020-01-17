/**
 * 
 */
package com.sample.implement;

import com.sample.model.SampleDataType;

/**
 * @author spatil28
 *
 */
public class ChildClass extends SampleDataType {
	
	private String name;
	
public void CheckVariables() {
	ChildClass c1 = new ChildClass();
	//c1.protected_d=3.5;
	double x = c1.protected_d;
	name="sagar";
}
}
