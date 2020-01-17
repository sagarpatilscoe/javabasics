/**
 * 
 */
package StringOperations;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author spatil28
 *
 */
public class StringReverse {

	public static void  main(String args[]) {
		
		
		//Revrse String without internal function 
		//reverseWithoutFun("Sagar Patil");
		//System.out.println( " Duplicate char counts");
		//duplicateCharinString("Sagar Patil");
		
	//	swapTwoNumbers(25, 46);
		//isPrime(437);
		//fiboNaci(8);
		
		//anagramCheck("Nikhil","likhNi" );
		
		String reversed= reverseRecursive("Sagar Patil");
		System.out.println("Reversed :"+reversed);
	}
	
	public static String reverseWithoutFun(String input) {
		
		String output=null;
	
		String[] tokenised= input.split(" ");
		
		for(int j =tokenised.length-1; j>=0;j--) {
			
		   char[] tmp = tokenised[j].toCharArray();
		   for(int i=tmp.length-1; i>=0 ;i--) {
			   System.out.print(tmp[i]);
		   }
		   System.out.print(" ");
		}
		
		return output;
	}
	
	public static String reverseRecursive(String str) {
		
		if(str.isEmpty()) {
			return str;
		}
		
		return reverseRecursive(str.substring(1))+str.charAt(0);
	}
	
	public static String duplicateCharinString(String input) {
		String tmp=null;
		
		
		Map<String,Long> res= input
        .chars()
        .mapToObj(i -> (char) i)
        .collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
        
		res.entrySet().forEach(e->System.out.println(" "+e.getKey()+"- "+e.getValue()));
		
		
		return tmp;
		
		
	}
	
	public static void swapTwoNumbers(int x,int y) {
		
		System.out.println("Before swap : x="+x+" y="+y);
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After swap : x="+x+" y="+y);
		
	}
	
	public static void isPrime(Integer number) {
		
		Integer temp;
		boolean isPrime= true;
		for(int i=2;i<=number/2;i++) {
			temp=number%i;
			System.out.println("Factor :"+i);
			if(temp==0) {
				isPrime=false;
				break;
			}
		}
		
		System.out.println("isPrime :"+isPrime);
	}
	
	public static void fiboNaci(Integer number) {
		
		int a=0,b=0,c=1;
		//System.out.print(" "+a+", "+b+", "+c);
		for(int i=1;i<=number;i++) {
		a=b;
		b=c;
		c=a+b;
		System.out.print(a + " ");
		}
		
	}
	
	public static void anagramCheck(String one,String two) {
		
		char[] oneArray = one.toCharArray();
		char[] twoArray= two.toCharArray();
		
		Arrays.sort(oneArray);
		Arrays.sort(twoArray);
		
		if(Arrays.equals(oneArray, twoArray)) {
			
			System.out.println("Given strings are Anagram");
		}
		else {
			System.out.println("Given strings are NOT Anagram");
		}
		
	}
}
