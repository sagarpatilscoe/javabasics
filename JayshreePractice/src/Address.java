/**
 * 
 */

/**
 * @author spatil28
 *
 */
public class Address {

	
public Address(String citiName,int pincode) {
	this.citiName=citiName;
	this.pincode=pincode;
}
	private String citiName;
	private int pincode;
	
	
public void setCitiName(String citiName) {
	this.citiName=citiName;
}
public String getCitiName() {
	return this.citiName;
}
public void setPincode(int pincode) {
	this.pincode=pincode;
}
public int getPincode() {
	return this.pincode;
}



}
