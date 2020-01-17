/**
 * 
 */
package com.jay.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/**
 * @author spatil28
 *
 */
public class DuplicateCount {

	public static void main(String[] args) {
		String string="This is my java program for java ";
		String[] item=string.split(" ");
		//char[] ch=str.toCharArray();
		HashMap<String,Integer> map= new HashMap<>();
		for(String str:item)
		{
		if(map.get(str)==null) {
			map.put(str, 1);
			}
		else {
			int cnt=map.get(str);
			cnt++;
			map.put(str, cnt);
		}
			
		}
		for(Entry<String,Integer> ent:map.entrySet()) {
			System.out.println("KEY:" + ent.getKey());
			System.out.println("Value:"+ ent.getValue());
		}
	}
	
	
}
