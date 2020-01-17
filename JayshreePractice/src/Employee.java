/**
 * 
 */

/**
 * @author spatil28
 *
 */
public class Employee {
	private String name;
	private int empno;
	private int age;
	private String desi;
	int a;
	int b;
	int salary;
	private Department dept;
   Employee() {
	
}
 
   Employee(int age, String name,int salary,Department d){
	   this.age=age;
	   this.name=name;
	   this.salary=salary;
	   this.dept=d;
   }
   Employee(int age, String name,int salary,String deptName,int deptId){
	   this.age=age;
	   this.name=name;
	   this.salary=salary;
	   this.dept=new Department(deptId, deptName);
	   
   }
   /* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	
	public boolean equals(Employee obj) {
		// TODO Auto-generated method stub
		//return super.equals(obj);
	     if(this.empno==obj.empno)
	    	 return true;
	    	 else
	    		return false;
	   
	}
   
   
public void setDept(Department dept) {
	this.dept=dept;
}
public Department getDept() {
	return this.dept;
}
public void setName(String str) {
	this.name=str;
}
public String getName() {
	return this.name;
}
public void setEmpno(int a) {
	this.empno=a;
}
public int getEmpno() {
	return this.empno;
}
public void setEmp(int age) {
	this.age=age;
	
}
public int getAge() {
	return this.age;
}

public void printEmp() {
	System.out.println("Employee");
	System.out.println("No="+ this.empno);
	System.out.println("Age="+ this.age);
	System.out.println("Salary="+ this.salary);
	System.out.println("EmpName="+this.name);
	System.out.println("Department Id"+this.dept.getDeptid());
	System.out.println("Department Name"+this.dept.getDeptName());
	System.out.println();
}
    	
	
}
