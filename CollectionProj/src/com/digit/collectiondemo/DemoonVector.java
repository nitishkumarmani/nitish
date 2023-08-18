package com.digit.collectiondemo;
import java.util.*;
public class DemoonVector {
 public static void main(String[] args) {
   Vector<Integer> v=new Vector<Integer>();
	System.out.println("Initial capacity: "+v.capacity());
	for(int i=1;i<=10;i++)
		v.add(i);
	
	for(Integer i:v)
		 System.out.println(i);
	
	v.add(11);
	System.out.println("Capacity after inserting 11 elements: "+v.capacity());
	for(int i=1;i<=10;i++)
		v.add(i);
	
	for(Integer i:v)
		System.out.println(i);
    v.add(21);
	System.out.println("Capacity after inserting 21 elements: "+v.capacity());
	
	 ArrayList<Integer>alist=new ArrayList<Integer>();
	 System.out.println(alist.size());
	 alist.ensureCapacity(10);
	 for(int i=1;i<=10;i++)
		 alist.add(i); //reflection to find array capacity
	 //minimum capacity is 10
	 
	 //vector follows enumeration
	 System.out.println("using enum");
	 Enumeration<Integer>myEnum=v.elements(); //return an enumeration
	 while(myEnum.hasMoreElements())
		  System.out.println(myEnum.nextElement());
	 
	 System.out.println("Final Capacity: "+v.capacity());
	 v.trimToSize();
	 System.out.println("After trime to size, the capacity: "+v.capacity());
	 
 }
}
