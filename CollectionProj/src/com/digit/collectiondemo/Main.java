package com.digit.collectiondemo;
import java.util.*;
public class Main {
 public static void main(String[] args) {
	//ArrayList of Employees 
	List<Employee> employeeList=new ArrayList<Employee>();
	
	//Objects to Employee Class
	Employee employee1=new Employee("Nitish",123,35235,"Bangalore");
	Employee employee2=new Employee("Abinash",124,36235,"Chennai");
	Employee employee3=new Employee("Babu",125,37235,"Hyderabad");
	Employee employee4=new Employee("Arun",126,38235,"Kolkata");
	Employee employee5=new Employee("Kumar",127,39235,"Mumbai");
	
	//Add employee objects to employeeList
	employeeList.add(employee1);
	employeeList.add(employee2);
	employeeList.add(employee3);
	employeeList.add(employee4);
	employeeList.add(employee5);
    
	//Printing employees
	System.out.println("-------------------------");
	System.out.println("Before sorting");
	for(Employee employee:employeeList)
		  System.out.println(employee);
	
	//The below statement will be error because of object created can't be able 
	//identify which attribute will it able to sort there should be comparator information
	 //Collections.sort(employeeList);
	   Collections.sort(employeeList, new CityComparator());
	   System.out.println("-------------------------");
		System.out.println("After sorting");
		for(Employee employee:employeeList)
			  System.out.println(employee);
	   Collections.sort(employeeList, new SalaryComparator());
	   System.out.println("-------------------------");
		System.out.println("After sorting");
		for(Employee employee:employeeList)
			  System.out.println(employee);
	   Collections.sort(employeeList, new NameComparator());
	   System.out.println("-------------------------");
		System.out.println("After sorting");
		for(Employee employee:employeeList)
			  System.out.println(employee);
//	 employeeList.sort(salary)
	 System.out.println("-------------------------");
		System.out.println("After sorting");
		for(Employee employee:employeeList)
			  System.out.println(employee);
		System.out.println("-----------------------");
		//System.out.println("Arun".compareTo("Kumar"));
	
   }
}
