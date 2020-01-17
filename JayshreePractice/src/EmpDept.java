/**
 * 
 */

/**
 * @author spatil28
 *
 */
public class EmpDept {
private Address a;

public void setAddress(Address a) {
	this.a=a;
}
public Address getAddress() {
	return this.a;
}
public static void main(String args[]) {
	
	/*EmpDept e = new EmpDept();
	Address a = new Address("Ahmedabad", 382440);
	Address a2 = new Address("Pune", 412440);

	e.setAddress(a2);
	Address a1= e.getAddress();
	System.out.println(a);
	System.out.println(a.getCitiName());
	System.out.println(a.getPincode());*/
    Employee emp = new Employee(32,"sagar",10000,new Department(12,"Biology"));
    Employee emp1=new Employee(23, "Jay", 50000, "Sci", 111);
    Employee emp2=new Employee(23, "Jay", 50000, "Sci", 111);
   // emp1=emp2;
    //emp1==emp2
    emp1.printEmp();
    emp.printEmp();
    System.out.println("Object comparison");
    if(emp1.equals(emp2)) {
    	System.out.println("Yes");
    }
    else
    	System.out.println("No");

}
}
