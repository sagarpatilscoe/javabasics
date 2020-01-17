import java.io.FileNotFoundException;
import java.io.IOException;

public class ChildClass extends ParentClass {

	
	public void printName(String name) throws FileNotFoundException{
		System.out.println("Child name :"+name);
		
	}
	
	public void printName(Integer name) throws IOException{
		System.out.println("Child name :"+name);
		
	}
	
	public void printAdd(String address) {
		System.out.println("Child address");
	}
}
