package com.digit.collectiondemo;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
public class SetDemo {
 public static void main(String[] args) {
	Set<Integer> set=new HashSet<Integer>();
	set.add(34);
	set.add(45);
	set.add(56);
	set.add(23);
	set.add(43);
	set.add(null);
	set.add(null);
	
	for(Integer i:set)
		System.out.println(i);
	
	set=new LinkedHashSet<Integer>();
	//LinkedHashSet<Integer> lset=new LinkedHashSet<Integer>();
	/*lset.add(45);
	lset.add(78);
	lset.add(23);
	lset.add(45);
	lset.remove(45);
	
	for(Integer i:lset)
		System.out.pr
		intln(i);*/
	/*LinkedHashSet<String> lset=new LinkedHashSet<String>();
	lset.add("Apple");	
	lset.add("Banana");
	lset.add("Cherry");
	lset.add("Orange");
    System.out.println("LinkedHashSet");
    while(itr.hasNext())
    	System.out.println(itr.next());*/
   TreeSet<Integer>tset=new TreeSet<Integer>();
   tset.add(67);
   tset.add(33);
   tset.add(69);
   tset.add(44);
   tset.add(77);
   
   Iterator<Integer> itr1=tset.iterator();
   while(itr1.hasNext())
	   System.out.println(itr1.next());
   
   System.out.println(tset.ceiling(65));
   System.out.println(tset.floor(66));
   
   System.out.println("First element of tree set "+tset.first());
   System.out.println("Last element of tree set "+tset.last());
   
   SortedSet<Integer>headSet=tset.headSet(45);
   System.out.println("Head set till 45");
   for(Integer i:headSet)
	   System.out.println(i);
   
   SortedSet<Integer>tailSet=tset.tailSet(45);
   System.out.println("Tail set to 45");
   for(Integer i:tailSet)
	   System.out.println(i);
   
    tset.add(12);
    tset.add(25);
    tset.add(88);
    tset.add(70);
    
    System.out.println("After updating treeset");
    for(Integer i:headSet)
    	System.out.println(i);
    
    System.out.println("After updating treeset, tailset is:");
    for(Integer i:tailSet)
    	System.out.println(i);
    
    //Descending order
    NavigableSet<Integer>nset=tset.descendingSet();
    System.out.println("Using Navigable set, Descending order of tset");
    for(Integer i:nset)
    	System.out.println(i);

    Iterator<Integer> itr=tset.iterator();
    itr=tset.descendingIterator();
    while(itr.hasNext())
    	System.out.println(itr.next());
    System.out.println("Higher to 67:"+tset.higher(67));
    System.out.println("Lower to 67:"+tset.lower(67));    
  } 
}
