import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionSample {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		try {
			System.out.println("Output : checkReturn() :"+checkReturn("hello"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	private static String checkReturn(String x) throws IOException {
		
		try {
			return "Try";
			//throw new Exception("Invalid return");
			
		}
		catch(Exception e) {
		
			System.out.println("Exception occured : "+e.getMessage());
			return " Execption";
		}
		finally {
			
			return "Fianlly";
		}
	}

}
