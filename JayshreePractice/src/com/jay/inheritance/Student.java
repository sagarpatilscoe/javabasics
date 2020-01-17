/**
 * 
 */
package com.jay.inheritance;

import java.util.ArrayList;

/**
 * @author spatil28
 *
 */
public class Student {

	public int id;
	public String name;
	public String[] subject;
	
	public static void main(String[] args) {
	
		Student stu=new Student();
		stu.subject=new String[3];
		stu.subject[0]="MAth";  //list
		stu.subject[1]="Bio"; //method with list object of subject
		stu.subject[2]="Chem";//method with student list 
		
		stuMethod(stu);
		for(int i=0;i<stu.subject.length;i++) {
			System.out.println(stu.subject[i]);
		}
		
		

		

	}
public static void stuMethod(Student stu) {
	System.out.println("Subject:"+stu.subject);
	
	
}
	
}
