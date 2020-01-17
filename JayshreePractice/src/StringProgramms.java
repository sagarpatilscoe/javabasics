import javax.net.ssl.ExtendedSSLSession;

/**
 * 
 */

/**
 * @author spatil28
 *
 */
public class StringProgramms 
{

	/**
	 * @param args
	 */
	protected int x;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="john"; //pool
		String str2="jo"+"hn";//john - pool - refer str1
		String str3="jo".concat("hn"); // concat always returns object on Heap .. like new String()
		String str4= new String("john"); // new object on heap
		String str5= new String("john");
		String str6="john";
		
		
		System.out.println(str1==str3);
		System.out.println(str1==str2);
		System.out.println(str2==str3);
		System.out.println(str3==str4);
		System.out.println(str5==str4);
	}

}



