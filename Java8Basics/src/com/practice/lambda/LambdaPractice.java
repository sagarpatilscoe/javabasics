/**
 * 
 */
package com.practice.lambda;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.sample.pojo.Device;
import com.sample.pojo.Employee;

/**
 * @author spatil28
 *
 */
public class LambdaPractice {
	
	 private List<Employee> empList;
		
	 LambdaPractice() throws ParseException{
		
			empList= new ArrayList<>();
			empList.add(new Employee(1,"Sagar",new SimpleDateFormat("yyyy-MM-dd").parse("2018-12-1"),8000.0d,1000d));
			empList.add(new Employee(2,"Sheryl",new SimpleDateFormat("yyyy-MM-dd").parse("2018-05-12"),6000.0d,2000d));
			empList.add(new Employee(3,"Nomura",new SimpleDateFormat("yyyy-MM-dd").parse("2016-03-27"),5500.0d,3000d));
			empList.add(new Employee(5,"John",new SimpleDateFormat("yyyy-MM-dd").parse("2017-08-30"),7500.0d,4000d));
			
		}

	public static void main(String args[]) throws Exception {
		Double avgSalary=0.0d;
		LambdaPractice lp = new LambdaPractice();
	    avgSalary =lp.empList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println("Avg salary of all Emp : "+avgSalary);
	   
		System.out.println("Employees with name starts with S");
		lp.empList.stream().filter(e->e.getName().startsWith("S")).forEach(s-> System.out.println(s.toString()));
	    
		System.out.println("Increment salary by 1000 to salary <6000");
		lp.empList.stream().map(e-> { 
			if(e.getSalary()<6000.0d)
				e.setSalary(e.getSalary()+1000.0);
			                             return e  ;      
			                                })
		.collect(Collectors.toList()).stream().forEach(e->System.out.println(e.toString()));
		
	}
}
