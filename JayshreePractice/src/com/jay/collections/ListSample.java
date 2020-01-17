/**
 * 
 */
package com.jay.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author spatil28
 *
 */
public class ListSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> mylist=new LinkedList();
		String[] arr= new String[3];
		arr[0]= "Ram";
		arr[1]="Sita";
		arr[2]="Geeta";
		
		
		mylist.add("x");
		mylist.add("y");
		mylist.add("z");
		for (String str : mylist) {
			System.out.println(str);			
		}
		mylist.remove(1);
		mylist.add("t");
		for (String str : mylist) {
			System.out.println(str);
			
		}
		System.out.println("*****************");
		List<String> temp=new LinkedList<>();
	temp=	copyArray(arr);
		for(String st:temp) {
			System.out.println(st);
		}
	}
	public  static List<String> copyArray(String[] strArray) {
		List<String> mylist=new ArrayList();
		mylist.add(strArray[0]);
		mylist.add(strArray[1]);
		mylist.add(strArray[2]);

		return mylist;
		
	
	}
	
	

}
