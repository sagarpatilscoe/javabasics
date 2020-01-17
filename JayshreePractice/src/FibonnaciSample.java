import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * 
 */

/**
 * @author spatil28
 *
 */
public class FibonnaciSample {

	/**
	 * @param args
	 */

	 private FibonnaciSample(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Printing fibbonacci series of n elements");
		int num=5;
		
		for(int i=0;i<=num;i++) {
			
		}
		
		//factorial();  
	   //fibonachi();
	 //stringPro();
	 //duplicateString();
	 //arrayEquals();
	 //arrayToarrlist();
	 //listToarray();
	 //pyramid();
	 int a=5,c; 
			int b=0;
			//c=a/b;
			c=b/a;
	 System.out.println(c);
	 
	 //Checking prime numbers
	 
	 for(int i=1;i<=100;i++) {
		 
		 boolean result=primeMethod(i);
	      System.out.println(i+" is prime :"+result);
	 }
	 
	}	
	
public static void factorial() {
	int num=5;
	int result=num;
	
	for(int i=num-1;i>0;i--) {
		
		result=  result*i;
		//num=result;
		
	}
	System.out.println(result);
}
public static void fibonachi() {
	int n=5, t1=0,t2=1;
	for(int i=0;i<=n;i++) {
		System.out.println(t1);
		
		int sum=t1+t2;
		t1=t2;
		t2=sum;
		
	}
}
public static void stringPro() {
	String str="Ahmedabad";
	char[] chaarr=str.toCharArray();	
	
	System.out.println(chaarr[0]);
	System.out.println(chaarr[1]);
	System.out.println(chaarr[2]);
	System.out.println(chaarr[3]);
	System.out.println(chaarr[4]);
	System.out.println("*******************");

	for(char a : chaarr) {
		
		if((a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u')) {
			System.out.println("VoWel:"+a);
		}
		else {
			System.out.println("Consonant");
			System.out.println(a);
		}
			
	}
	//if(chaarr[]=='a'||'e'||'i'||'o'||'u')	{
		
	//}
}

public static void duplicateString() {
	String[] strArray= {"Java","Jsp",".Net","SQL","Java"};
	HashSet<String> set= new HashSet<String>();
	
	for(String str:strArray) {
		if(!set.add(str)) {
			System.out.println("duplicate Element:"+ str);
		}
	}
	
	
	
	
}

public static void arrayEquals() {
	int[] arrayOne= {1,2,6,4,5};
	int[] arrayTwo= {1,2,3,4,5};
	
	Boolean arr=Arrays.equals(arrayOne, arrayTwo);
	System.out.println(Arrays.toString(arrayOne));
	
	if(arr) {
		System.out.println("Arrays are Equal");
	}
		else 
		{
			System.out.println("Arrays are Not equal");
		}
	}

public static void arrayToarrlist() {
	String[] strArray= {"Java","JSP","Selenium"};
	ArrayList<String> list=new ArrayList<>(Arrays.asList(strArray));
	System.out.println(list);
	}

public static void listToarray() {
	ArrayList<String> list= new ArrayList<>();
	list.add("Java");
	list.add("Sql");
	list.add("DB");
	list.add("Qtp");
	
	String[] array= new String[list.size()];
	list.toArray(array);
	for(String str:array) {
		System.out.println(str);
	}
	

}
public static void pyramid() {
	int i,j,n=5;
	for(i=1;i<n;i++) {
		System.out.println();
		for(j=1;j<=i;j++) {
			System.out.print(j+ " ");
			
		}
	}
}
	protected static void pyramid(int a) {

	
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




