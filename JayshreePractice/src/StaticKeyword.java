/**
 * 
 */

/**
 * @author spatil28
 *
 */
public class StaticKeyword {

	static int staticCount;
	int defaultCnt;
	static int i=3;
	int j=4;
	
	static {
		//System.out.println("I am static");
	}
	
	 StaticKeyword(){
		//System.out.println("Constructor called");
	}
	 StaticKeyword(int x){
			//System.out.println("Constructor called");
		}
	 StaticKeyword(int x,int y){
		 this(x);
		//System.out.println("Constructor called");
		}
	
	public static void main(String[] args) {
		
		System.out.println("Main method called");
		StaticKeyword sk1= new StaticKeyword();
		StaticKeyword sk2= new StaticKeyword();
		
		
		
	/*	
		sk1.defaultCnt++;
		System.out.println("sk1 default cnt :"+sk1.defaultCnt);
		sk2.defaultCnt++;
		System.out.println("sk2 default cnt :"+sk2.defaultCnt);
		StaticKeyword.staticCount++;
	//	sk1.staticCount++;
		System.out.println("sk1 static cnt :"+sk1.staticCount);
		//sk2.staticCount++;
		StaticKeyword.staticCount++;
		System.out.println("sk2 static cnt :"+sk2.staticCount);*/
		int j=9;
		sk1.method1(i,j);
		StaticKeyword sk= new StaticKeyword();
		sk.method1(i, sk.j);
		
		
		
	}
	public  void method1(int i, int j) {
		//static int a=0;
		//defaultCnt;
		System.out.println(defaultCnt);
		System.out.println(i);
		System.out.println(j);
	}
	
}
