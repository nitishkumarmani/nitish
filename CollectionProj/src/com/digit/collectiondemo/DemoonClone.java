package com.digit.collectiondemo;
import java.util.*;
public class DemoonClone {
 public static void main(String[] args) {
	ArrayList<Integer> orginialList=new ArrayList<Integer>();
	orginialList.add(56);
	orginialList.add(34);
	orginialList.add(88);
	orginialList.add(21);
	
	ArrayList<Integer>copyList=orginialList;
	System.out.println("CopyList hashcode: "+copyList.hashCode());
	System.out.println("OriginalList hashcode: "+orginialList.hashCode());
	
	orginialList.add(789);
	System.out.println("Elements of copylist");
	for(Integer i:copyList)
		System.out.println(i);
	
	System.out.println("-----------------");
	System.out.println("Cloning");
	ArrayList<Integer> clonedList=(ArrayList<Integer>) orginialList.clone();
	System.out.println("Original hashcode: "+orginialList.hashCode());
	System.out.println("ClonedList hashcode:"+clonedList.hashCode());
	
    System.out.println("Elments of clone list");
    for(Integer i:clonedList)
    	System.out.println(i);
    
    orginialList.add(234);
    
    System.out.println("After modification on original list");
    for(Integer i:orginialList)
    	  System.out.println(i);
    	
	System.out.println("Elements of cloned list");
	for(Integer i:clonedList)
		System.out.println(i);
	
}
}
