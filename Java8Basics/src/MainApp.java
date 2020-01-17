import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.LinkedList;

import com.sample.pojo.Employee;

public class MainApp {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		LinkedList<Employee> employees = new LinkedList<>();
       try {
		employees.add(new Employee(1,"Sagar",new SimpleDateFormat("yyyy-MM-dd").parse("2018-12-1"),80.0d,20d));
		employees.add(new Employee(2,"Sheryl",new SimpleDateFormat("yyyy-MM-dd").parse("2018-05-12"),60.0d,30d));
		employees.add(new Employee(3,"Nomura",new SimpleDateFormat("yyyy-MM-dd").parse("2016-03-27"),55.0d,40d));
		employees.add(new Employee(5,"John",new SimpleDateFormat("yyyy-MM-dd").parse("2017-08-30"),75.0d,50d));
         }
		catch(Exception e) {
			e.printStackTrace();
		}
       

        System.out.println("=== Iterate over a LinkedList using Java 8 forEach and lambda ===");
        employees.forEach(name -> {
            System.out.println(name);
        });
        //Immutability test 
        
        immutabilityTest();
        
       
        
		
	}
	
	private static ImmutableClass doSomething() {
		
		
		ImmutableClass s1=ImmutableClass.create(7);
		
		return s1;
	}
	private static void immutabilityTest() throws ParseException {
		 ImmutableClass ic= ImmutableClass.create(6);
		
	    final Employee emp =  new Employee(1,"Sagar",new SimpleDateFormat("yyyy-MM-dd").parse("2018-12-1"),8000.0d,1000d);
		emp.setName("Sam");
		
		//Not possible below 
		// emp = new Employee(2,"Sheryl",new SimpleDateFormat("yyyy-MM-dd").parse("2018-05-12"),6000.0d,2000d);
		
		System.out.println(" Immutable Ref : ");
		System.out.println(emp.toString());
		
		ImmutableClass it=ic;
		System.out.println("before modify ic :"+ic.getCount());
		
		
		
		System.out.println("after it=ic it : "+it.getCount());
		ic= doSomething();
		System.out.println("after modify ic : "+ic.getCount());
		
	}

}
