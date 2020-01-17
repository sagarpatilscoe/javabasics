/**
 * 
 */
package com.jay.collections;

import java.util.HashSet;

/**
 * @author spatil28
 *
 */
public class duplicateSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		String string= "Hello Java Hello";
		String[] strArr=string.split(" ");
		HashSet<String> set= new HashSet<>();
		for(String str:strArr) {
			if(!(set.add(str))) {
				System.out.println("Duplicate:"+ str);
			}
		}
		String str1="abscabs";
		char[] ch=str1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					System.out.println(ch[j]);
				}
			}
		}

		String str2="Hello World";
		String st="";
		String revrse[]=str2.split(" ");
		for(int i=revrse.length-1;i>=0;i--) {
			st+=revrse[i]+ " ";
		}
		System.out.println(st);

		String str3="HelloWorld";
		char[] s=str3.toCharArray();
		String ss=" ";
		for(int i=s.length-1;i>=0;i--) {
			ss+=s[i];
		}
		System.out.println(ss);
	
	
	
	}
	
	
}
