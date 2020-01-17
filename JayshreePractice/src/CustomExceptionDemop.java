import java.io.FileNotFoundException;

/**
 * 
 */

/**
 * @author spatil28
 *
 */
public class CustomExceptionDemop extends Exception{

	final Employee emp=new Employee();
	
	
	public CustomExceptionDemop(String msg) {
		super(msg);
	}
	
	
public static void main(String[] args) {
	
	try {
		m1();
	
	}
	catch (CustomExceptionDemop e) {
		
		e.printStackTrace();
		// TODO: handle exception
	}
	String result=m2();
	System.out.println("Result :"+result);
	
}
public static void m1() throws CustomExceptionDemop {
	if(true) {
		System.out.println("Throwing an exception");
		throw new CustomExceptionDemop("My exception");
	     //throw new FileNotFoundException();
	   // System.out.println("sa");
		//emp = new Employee();
		
		
	}
	
}

public  String m2()  {
	
	Employee emp1 = new Employee();
	emp1=emp;
	//emp=emp1;
	
	try {
		System.out.println("Try block");
		throw new Exception("eg");
		//return "Try";
	}
	catch(Exception e) {
		System.out.println("Catch block");
		System.exit(0);
		return "catch";
	}
	finally {
		System.out.println("Finally block");
	}
}
}
