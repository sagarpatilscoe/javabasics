/**
 * 
 */
package com.jay.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author spatil28
 *
 */
public class MapSample{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		Set<String> set= new HashSet<>();
		map.put(1,"A");
		map.put(2,"B");
		map.put(3,"C");
		
		mapMethod(map,set);
		System.out.println("SET 1");

		for(String str:set) {
			System.out.println(str);
		}
		
	//---------------------------------------------------	
		System.out.println("SET 2");
		Set<String> set2=mapMethod(map);
		for(String str:set) {
			System.out.println(str);
		}
		
		for(String str:set2) {
			System.out.println(str);
		}
	

	}
	public static void mapMethod(Map<Integer,String>  map,Set<String> set) {
		

		for(Entry<Integer, String> ent:map.entrySet()) {
			//System.out.println(ent.getKey() +"   "+ent.getValue());
			set.add(ent.getValue());
		}
		
		
	}
	public static Set<String> mapMethod(Map<Integer,String>  map) {
		Set<String> set= new HashSet<>();
		map.put(1,"X");
		map.put(2,"Y");
		map.put(3,"Z");

		for(Entry<Integer, String> ent:map.entrySet()) {
		//	System.out.println(ent.getKey() +"   "+ent.getValue());
			set.add(ent.getValue());
		}
		return set;
		
	}

}
