package com.digit.collectiondemo;

import java.util.*;

public class ArrayListDemo {

	public static <E> void main(String[] args) {
		/*ArrayList alist=new ArrayList();
		alist.add(45);
		alist.add(67.89);
		alist.add("Nitish");
		alist.add(true);
		System.out.println("-----------------");
		for(int i=0;i<alist.size();i++)
			System.out.println(alist.get(i));
		System.out.println("-----------------");
		System.out.println(alist.get(3));
		System.out.println(alist.size());
		System.out.println("-----------------");
		alist.add(3,"Nitish");
		for(int i=0;i<alist.size();i++)
			System.out.println(alist.get(i));
		System.out.println("-----------------");
		System.out.println("Element deleted:"+alist.remove(1));
		System.out.println("-----------------");
		for(int i=0;i<alist.size();i++)
			System.out.println(alist.get(i));
		System.out.println("-----------------");*/
		
		ArrayList<Integer>alist=new ArrayList<Integer>();
		alist.add(45);
		alist.add(46);
		alist.add(23);
		alist.add(90);
		alist.add(23);
		alist.add(3,78); //adding the element at the index-3
		/*for(int i=0;i<alist.size();i++)
			System.out.println(alist.get(i));*/
		
		System.out.println("Using Enhanced for loop");
		for(Integer i:alist) //i refers to an element of arraylist, enhanced for loop
			System.out.println(i);
		System.out.println("--------------");
		System.out.println("Using list iterator");
		Iterator itr=alist.listIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println(alist.contains(78));
	    
		ArrayList<Integer> alist1=new ArrayList<Integer>();
		alist1.add(23);
		alist1.add(78);
		alist1.add(45);
		
		alist.retainAll(alist1);
		System.out.println("------------------");
		System.out.println("After RetainAll");
		for(Integer i:alist)
			 System.out.println(i);
		
		System.out.println("------------");
		System.out.println("Placing one object reference on another");
		ArrayList<Integer>alist2=alist;
		System.out.println(alist.hashCode());
		System.out.println(alist2.hashCode());
        	
		System.out.println("-------------");
		System.out.println("Cloning");
		ArrayList<Integer> clonedList=new ArrayList<Integer>();
		clonedList= (ArrayList<Integer>) alist.clone();
		System.out.println(clonedList.hashCode());
		System.out.println(alist.hashCode());
		System.out.println("After cloning adding element to alist");
		alist.add(56);
		System.out.println(alist.hashCode());
		System.out.println("------------------");
		System.out.println("After updation on alist,clonedlist info");
		for(Integer i:clonedList)
			System.out.println(i);
		System.out.println("------------------");
		
		System.out.println("After updation alist2");
		for(Integer i:alist2)
			System.out.println(i);
		
		System.out.println(alist.hashCode());
		System.out.println(clonedList.hashCode());
		alist.add(100);
		System.out.println("Modification of hashcode");
		System.out.println(alist.hashCode());
		
	}
    
	
	
}
