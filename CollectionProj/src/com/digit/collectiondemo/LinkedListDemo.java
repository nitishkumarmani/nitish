package com.digit.collectiondemo;
import java.util.Collections;
import java.util.LinkedList;
public class LinkedListDemo {
  public static void main(String[] args) {
	 LinkedList<String> ll=new LinkedList<String>();
	 ll.add("apple");
	 ll.add("chickoo");
	 ll.add("orange");
	 ll.add("mango");
	 
	 for(String s:ll)
		 System.out.println(s);
	 System.out.println(ll.get(2));
	 System.out.println(ll.contains("orange"));
	 System.out.println(ll.remove("orange"));
	 System.out.println("----------------");
	 for(String s:ll)
		 System.out.println(s);
	 
	 //Linked List has several methods such as offer method, offer first, offer last we can use 
	 //according to its needs
	 
	 Collections.sort(ll);
	 System.out.println("----------------------");
	 for(String i:ll)
		 System.out.println(i);
	 
}
}
