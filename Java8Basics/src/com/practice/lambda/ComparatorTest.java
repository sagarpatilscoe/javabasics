package com.practice.lambda;

import java.util.Collections;
import java.util.List;

import com.sample.pojo.Person;

import java.util.Comparator;

/**
 * @author MikeW
 */
public class ComparatorTest {

  public static void main(String[] args) {
   
    List<Person> personList = Person.createShortList();
  
    // Sort with Inner Class
    Collections.sort(personList, new Comparator<Person>(){
      public int compare(Person p1, Person p2){
        return p1.getSurName().compareTo(p2.getSurName());
      }
    });
    
    System.out.println("=== Sorted Asc SurName ===");
    for(Person p:personList){
      p.printName();
    }
    
    // Use Lambda instead
    
    // Print Asc
    System.out.println("=== Sorted Asc SurName Compare===");
    Collections.sort(personList, (Person p1, Person p2) -> p1.getSurName().compareTo(p2.getSurName()));
    personList.forEach(System.out::println);
        //Comparing 
    
   System.out.println("=== Sorted Asc SurName Using Comparing ===");
    personList.sort(Comparator.comparing(Person::getSurName));
    //Collections.sort(personList, (Person p1, Person p2) -> p1.getSurName().compareTo(p2.getSurName()));
    personList.forEach(System.out::println);
   
    
    // Print Desc
    System.out.println("=== Sorted Desc SurName ===");
    Collections.sort(personList, (p1,  p2) -> p2.getSurName().compareTo(p1.getSurName()));

    personList.forEach(System.out::println);
     
  }
}