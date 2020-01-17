import java.util.HashSet;
import java.util.Set;

/**
 * 
 */

/**
 * @author spatil28
 *
 */
public class ArraySample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr= {5,10,15,20};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			//System.out.println(arr[i+1]);
			//int diff=arr[i+1]-arr[i];
			//System.out.println(diff);
			
		}
		System.out.println("Number swap");
		int a=23;
		int b=39;
		System.out.println(a/10);
		System.out.println(a%10);
		int tenpalc1=a/10;
		int unitplc1=a%10;
		int tenpalc2=b/10;
		int unitplc2=b%10;
		System.out.print(tenpalc1+" ");
		System.out.println(unitplc1);
		System.out.print(tenpalc2+" ");
		System.out.println(unitplc2);
		
		int num1=tenpalc1*10+unitplc2;
		int num2=tenpalc2*10+unitplc1;
		
		System.out.println("wapped 1st  digits");
		System.out.println(num1 +" "+num2);
		
		//// Largest Number Program
		int t1=arrayLarge(arr);
		System.out.println("Largest Number:"+ t1);
/// duplicate arrray pro.	
		duplicate();
	
	}

	
	public static int arrayLarge(int arr[]) {
		int t1=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(t1<arr[i]) {
				t1=arr[i];
			}
		}
		
		
		return t1;
		
	}
	
	public static void duplicate() {
		
		String[] str= {"java","sql","MB","sql"};
		
		Set<String> set= new HashSet<>();
		System.out.println("Adding elements");
		
		for(String s:str) {
			System.out.println("Adding :"+ s);
			if(!set.contains(s)) {
				set.add(s);
			}
			else {
				System.out.println("Duplicate Element:"+ s);
			}
		
		}
		
		for(String val:set) {
			System.out.println("Set val:"+ val);
		}
	}
	
	
	
}
