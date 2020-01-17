/**
 * 
 */

/**
 * @author spatil28
 *
 */
public class MethodCalling {

	
	
	

	public static void main(String[] args) {
	int finalRes=method2(1, 2, 3);
		System.out.println(finalRes);
		
		stringReverse("Jayshree");
		
	}
public static int  method1(int a,int b) {
	int c= a+b;
	return c;
}
public static int  method2(int x,int y, int z) {
    int res;
	res= method1(x,y);	
	return res*z;	
}

public static void stringReverse(String str) {
    String temp="";
    for(int i=str.length()-1;i>=0;i--) {
    	temp=temp+str.charAt(i);
    }
	System.out.println(temp);

}
}
