import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.sample.pojo.Device;
import com.sample.pojo.Employee;

public class StreamBasics {

   private  List<Device> d;
   private List<Employee> empList;
	
	StreamBasics() throws ParseException{
		d = new ArrayList();
		d.add(new Device("A",1l));
		d.add(new Device("B",2l));
		d.add(new Device("C",1l));
		d.add(new Device("A",5l));
		d.add(new Device("A",6l));
		d.add(new Device("B",1l));
		empList= new ArrayList<>();
		empList.add(new Employee(1,"Sagar",new SimpleDateFormat("yyyy-MM-dd").parse("2018-12-1"),8000.0d,1000d));
		empList.add(new Employee(2,"Sheryl",new SimpleDateFormat("yyyy-MM-dd").parse("2018-05-12"),6000.0d,2000d));
		empList.add(new Employee(3,"Nomura",new SimpleDateFormat("yyyy-MM-dd").parse("2016-03-27"),5500.0d,3000d));
		empList.add(new Employee(5,"John",new SimpleDateFormat("yyyy-MM-dd").parse("2017-08-30"),7500.0d,4000d));
		
	}
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
         StreamBasics sb = new StreamBasics();
     
          //  sb.streamSort(); 
	    //sb.streamSum();
		sb.lambda();
		
	
	}
	
	private void streamSort() {

		System.out.println("first :"+d.stream().findFirst().toString());
		System.out.println("Sorted based on device name :");
		List<Device> sorted= d.stream().sorted(Comparator.comparing(Device::getDeviceName))
				.collect(Collectors.toList());
		
		System.out.println("After Sorting  :");
		sorted.forEach(System.out::println);
	}
	
	private void streamSum() {
		Double salarySum=empList.stream().mapToDouble(emp -> emp.getSalary()).sum();
	     System.out.println("Sum of salaries : "+salarySum);
	    
	    Double s= empList.stream().collect(Collectors.summingDouble(Employee::getSalary));
	    System.out.println("Collect sum : "+d);
	     empList.stream().collect(Collectors.summingDouble(Employee::getBonus));
	     System.out.println("Map Sum :"+empList.stream().mapToDouble(Employee::getSalary).sum());
	    // Collectors.
	    // articles.collect(Collectors.summingInt(Article::getWordCount));  
	     //Reduce :
	     System.out.println("Fliterd : bonus > 2000");
	     empList.stream().filter(e-> e.getBonus()>2000d).forEach(System.out::println);
	     
	}
	
	private void lambda() {
		/*List<Employee> temp = new ArrayList();
		empList.forEach(e->{ 
			if(e.getName().equals("sagar"))
				temp.add(e);
			});*/
		System.out.println("Before eSort : ");
		empList.forEach(System.out::println);
		Collections.sort(empList,(e1,e2)->e1.getName().compareTo(e2.getName()));
		System.out.println("after eSort : ");
		empList.forEach(System.out::println);
	}

}
