/**
 * 
 */
package com.jay.casting;

/**
 * @author spatil28
 *
 */
public class TypeCastSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
		stringOperations();
		
		String s="a";
		int i=1;
		float j=1.1f;
        double k=2.2;
        long l=3;
        Integer ii;
        Long long_l=8l;
       
        i=(int)j;
        i=(int)l;
        
        
        System.out.println("float to int :"+i);
        
        
         operators();
	}
	
	public static void operators() {
		
		int i=0;
	 	System.out.println("i++ :"+ i++);
        System.out.println("++i :"+ ++i);		
		int j=0;
		int k=0;
       j+=1;
       k-=1; 
       //i++ i=i+1;
       
		System.out.println("j :"+j);
		System.out.println("k :"+k);
		i=1;
		if(2==++i) {
	      int x=24/++i;
			System.out.println("incremented first :"+x);
		}
		if(i==2) {
			System.out.println("incremented later");
		}
	}
	
	public static void stringOperations() {
		String s1="Sagar";
		s1="XYZ";
		String s2=s1;
		s1=s2;
		System.out.println(s1);
		
		String s3=new String("Jayshree");
		String s4=new String("Shrey");
		s3=s4;
		s3=new String("JAnki");
		System.out.println("s3:"+s3);
	String sub=	s3.substring(1);
	System.out.println(s3+" : sub -> "+sub);
	
	System.out.println(s3.substring(1, 4));
	
	System.out.println(s3.concat("QA"));
	
	for(int i =0; i<s3.length();i++) {
		System.out.print(s3.charAt(i)+"+");
	}
	for(char c:s3.toCharArray()) {
		
		System.out.print(c+"+");
		
	}
	  String txt = "Please locate where 'locate' occurs!";
	  System.out.println("Index");  
	  System.out.println(txt.indexOf("locate"));
	  
	  String x = "10";
	  int y = 20;
	  String z = x + y;
	
}

	
		  

}


