/**
 * 
 */
package ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

import com.sample.pojo.Student;

/**
 * @author spatil28
 *
 */
public class ConcurentCheck {

	
	
	public static void main(String[] args) {
		
		Student s1 = new Student("sagar",1);
		Student s2 = new Student("samir",12);
		Student s3 = new Student("nikhil",9);
		
		
		ConcurrentHashMap< Integer, String> myMap = new ConcurrentHashMap<>();
		
		System.out.println(" 1 Hash value : "+s1.hashCode()+" Index with HEX "+(s1.hashCode() & 0x1F));
		System.out.println("12 Hash value : "+s2.hashCode()+" Index with HEX "+(s2.hashCode() & 0x1F));
		System.out.println(" 9 Hash value : "+s3.hashCode()+" Index with HEX "+(s3.hashCode() & 0x1F));
		
		myMap.put(1, "sagar");
		myMap.put(12, "samir");
		myMap.put(9, "nikhil");
		
		System.out.println("");
		
		
		
	}
}
