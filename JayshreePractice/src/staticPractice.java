/**
 * 
 */

/**
 * @author spatil28
 *
 */
public class staticPractice {
	
	static int staticvar;
	int nonstaticvar;
	
	public static void main(String args[]) {
		staticMethod(6);
		staticPractice sp = new staticPractice();
		sp.nonstaticMethod();
		char c='@';
		int val=c;
		
		
		System.out.println("ASCII value :"+val);
		System.out.println("number palindrom check");
		numbPalindrom(121);
		numbPalindrom(544);
	}
public static void staticMethod(int x) {
	System.out.println(x);
	System.out.println("Static Method:"+staticvar);
	
}
public void nonstaticMethod() {
	//System.out.println("NonStatic Method:"+staticvar);
	System.out.println("Nonstatic Method:"+nonstaticvar);
	staticMethod(7);
}

public static void numbPalindrom(int x) {
	
	String num=Integer.toString(x);
	
System.out.println("input:"+num);
	char[] chara=num.toCharArray();
	String result=new String();
	for(int i=chara.length-1;i>=0;i--) {
	result+=String.valueOf(chara[i]);
	
	}
System.out.println("Reversed :"+result);
}

}




