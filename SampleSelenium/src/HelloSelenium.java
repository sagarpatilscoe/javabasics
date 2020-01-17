/**
 * 
 */

/**
 * @author spatil28
 *
 */
public class HelloSelenium {

	 HelloSelenium(){
		
	}
HelloSelenium(String name){
		this.name=name;
	}
HelloSelenium(String name,String x){
	this.name=name;
}
	
	private String name="sagaer";
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Arguments : ");
         
         for(String s:args) {
        	 System.out.println(s);
         }
		HelloSelenium hs= new HelloSelenium();
		hs.setName("Hello xyz..");
		System.out.println(hs.getName());
		hs.checkName();
		   
	//	int x = "10"/5;
		//double db="xyz"/0;
		
	}

	public void checkName() {
		String tmpName="sagar";
		System.out.println("temp Name :"+tmpName);
	}
}
