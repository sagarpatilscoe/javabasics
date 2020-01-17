/**
 * 
 */

/**
 * @author spatil28
 *
 */
public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 primeMethod(5);
 primeMethod(12);
	}

	public static boolean primeMethod(int num) {
		
		if(num==1) {
			System.out.println("Number is Prime");
				}
		for(int i=2;i<num;i++)
		{
			if(num%i==0) {
				System.out.println("N is not Prime");
				return false;
			}
		}
		
		System.out.println("num is prime");
	     return true;	
		
		}
		
		
		
}
