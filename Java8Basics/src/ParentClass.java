import java.io.FileNotFoundException;
import java.io.IOException;


public class ParentClass {

	private String name;
	protected String address;
	
	
	
	public void printNumber(Object n) {
		System.out.println("Overloaded Object :"+n);
	}
	public void printNumber(Integer n) {
		System.out.println("Overloaded Integer :"+n);
	}
	/*public void printNumber(int n) {
		System.out.println("Overloaded int :"+n);
	}*/
	public void printNumber(Long n) {
		System.out.println("Overloaded Long :"+n);
	}
	
	//*******************************************************************
	public void printName(int n) {
		System.out.println("Overloaded int :"+n);
	}
	
	
/*	protected void printName(Integer n) throws IOException{
		System.out.println("Print Name :Integer :"+n);
	}*/
	public void printName(Object n) {
		System.out.println("Print Name :Object :"+n);
	}
	public void printName(String name) throws FileNotFoundException {
		System.out.println("Print Name : String :"+name);
	}
	
	
	public static void main(String[] args) {
		
		ParentClass par = new ParentClass();
		try {
			System.out.println("String,Object,int");
			par.printName(null);         // will compile and run overloaded method of param String
			
			System.out.println("String,Object,Integr"); // Ambiguous with String/Integer
			//par.printName(null);
			
			
			System.out.println("Object,int,Long");
			par.printNumber(1); //Compile and execute with int
		
		//par.printNumber(null); //Compile and execute with output Long
			
			System.out.println("Object,Integer,Long");
			par.printNumber(1); //compile and execute with Integer
		
			//par.printNumber(null); //Ambiguous with Object and Integer
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
