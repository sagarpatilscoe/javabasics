import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author spatil28
 *
 */
public class Generics {

	public static void main(String[] args)
     {
	
      List<String> stringList = new ArrayList();
      List<Object> objectList = new ArrayList();
      List rawList= new ArrayList();
      String s = "xyz";
      Object o ;
       o=s;
      
      
    /*  stringList=objectList; // Compile error
      
      objectList=stringList;//Compile error
*/      
      
      rawList=objectList; //Run time error
      rawList=stringList; // run time errror
      
      
     }
}
