/**
 * 
 */
package com.jay.inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author spatil28
 *
 */
public class Teacher {
	private List<String> subjects;
	private String name;
public Teacher() {
	
}
public Teacher(String name,List<String> subjects) {
	this.name=name;
	this.subjects=subjects;
	
}
public Teacher(String name,String[] strarr) {
	this.name=name;
	this.subjects=Arrays.asList(strarr);
	/*this.subjects=new ArrayList<String>();
	for(String str:strarr) {
		subjects.add(str);
	}*/
}
public void setSubjects(List<String> subjects) {
	this.subjects=subjects;
}
public List<String> getSubjects(){
	return this.subjects;
}
public void setName(String name) {
	this.name=name;
	
}
public String getName() {
	return this.name;
}
public void printMethod() {
	//System.out.println("Message:"+msg);
	System.out.println("Name:"+this.name);
	System.out.println("Subjects:"+this.subjects);
}

}
 