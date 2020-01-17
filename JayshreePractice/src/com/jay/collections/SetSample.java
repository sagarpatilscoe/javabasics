/**
 * 
 */
package com.jay.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

/**
 * @author spatil28
 *
 */
public class SetSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> set= new HashSet<String>();
		
		set.add("Avni");
		set.add("Shry");
		set.add("moni");
		
		ArrayList<String> arr=new ArrayList<>();
		
		
		ListIterator<String> lstI=arr.listIterator();
		lstI.previous();
		/*while(lstI.hasNext()) {
			lstI.
			
		}*/
		
		Iterator<String> itr=set.iterator();
		   
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		/*while(boolean) {
			
		}*/
		
		for(String str:set) {
			System.out.println(str);
		}
		
	}

} 
