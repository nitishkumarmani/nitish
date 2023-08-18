package com.digit.collectiondemo;
import java.io.Serializable;
import java.util.*;
public class Employee{
   private String name;
   private String City;
   private int id;
   private double salary;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(String name, int id, double salary,String City) {
	super();
	this.name = name;
	this.id = id;
	this.salary = salary;
	this.City=City;
}

public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", salary=" + salary +",City="+ City +"]";
}

}
/*@Override
public  int compareTo(Employee emp) {
	//return this.getName().compareTo(emp.getName());
	return (int) (this.getSalary()-emp.getSalary());
	//return this.getId()-emp.getId();
}
   //Multiple return methods cannot be used 
*/
