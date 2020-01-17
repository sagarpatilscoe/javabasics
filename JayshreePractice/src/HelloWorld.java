/**
 * 
 */

/**
 * @author spatil28
 *
 */
public class HelloWorld {

  private String str="Hello World";
	
	public static void main(String[] args) {
	
		int a,b;
		Employee emp1=new Employee();
		System.out.println(emp1.a +""+ emp1.b);
		Employee emp2 = new Employee(29, "Sagar", 35,new Department(123,"bio"));
		//System.out.println(emp2.getAge() +" "+ emp2.getName() +" "+ emp2.salary);
		//Assign obj ref to each other
		emp2.printEmp();
		emp1.printEmp();
		
		emp1=emp2;
		emp1.printEmp();
		emp2.setEmpno(33);
		emp1.salary=2000;
		System.out.println("*******EMP 1********");
		emp1.printEmp();
		System.out.println("-------EMP 2-------");
		emp2.printEmp();
				
		/*String str1="Hi World";
		HelloWorld hs= new HelloWorld();
        System.out.println("My First Pr:" + hs.str);	
        hs.str=str1;
        System.out.println("After change:" +hs.str);
        hs.str="Hi Sagar";
        System.out.println("After Direct assign:"+hs.str);

        hs.printName();*/
		/*
		 * PAssing arguments to method
		 */
		Employee emp=new Employee();
		emp.setEmpno(456);
		emp.setName("Jayshree");
		System.out.println("Name:"+emp.getName());
		System.out.println("EmpNo:"+emp.getEmpno());

        
        
        
		
	}
	public void printName() {
		System.out.println("From method within class");
		System.out.println(str);
	}

}
