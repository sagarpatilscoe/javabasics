/**
 * 
 */
package com.jay.inheritance;

import java.util.ArrayList;
import java.util.List;

/**
 * @author spatil28
 *
 */

public class TeacherMainMethod {
	String name;
	List<String> subjects;

	public static void main(String[] args) {
		
		
		List<String> liststr1=new ArrayList<>();
		liststr1.add("Math");
		liststr1.add("Bio");
		liststr1.add("Chem");

		
		Teacher tm1=new Teacher("Sagar", liststr1);
		
		Teacher tm2=new Teacher("Sam", liststr1);
		Teacher tm3=new Teacher("Tom", liststr1);
		Teacher teachArr= new Teacher("arr", new String[] {"x","y","Z"});
		List<Teacher> lisTea=new ArrayList<>();
		lisTea.add(tm1);
		lisTea.add(tm2);
		lisTea.add(tm3);
		teachArr.printMethod();
		//teacherList(lisTea);
		
	//	tm1.printMethod();
		
		//copylist(liststr1);

	}
	public static void  teacherList(List<Teacher> trlist){
		
		for(Teacher te:trlist ) {
			te.printMethod();
//			System.out.println(te.getName());
//			//subList is instance var to store Subject list returned by getSubjectsmethod
//			List<String> subList=te.getSubjects();
//			
//			System.out.println("Subjects");
//			
//			for(String str:subList){
//				System.out.println(str);
//			}
//			for(String str:te.getSubjects()) {
//				System.out.println(str);
//			}
			
	
		}
		

		
	}
	public static void copylist(List<String> lstr) {
		List<String> lstr1=new ArrayList<>();
		for(String lst:lstr) {
			lstr1.add(lst);
		}
		
		
//		for(int i=0;i<lstr.size();i++) {
//			lstr1.add(lstr.get(i));
//		}
//		System.out.println(lstr1);
	}

}
