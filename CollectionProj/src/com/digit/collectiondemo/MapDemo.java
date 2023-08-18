package com.digit.collectiondemo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
public class MapDemo {
  public static void main(String[] args) {
/*	Map<Integer,String>map=new HashMap<Integer,String>();
	map.put(5, "Swapna"); //<key,value>--->entry
	map.put(3, "Swathi");
	map.put(8, "Amit");   //map does not have point to same keys
	map.put(2, "Keerti");
	map.put(1, "Amit");
	for(Integer key:map.keySet())
		System.out.println(map.get(key));
	//printing all entries of map
	System.out.println(map);
	//printing only keys
	System.out.println(map.keySet());
	//printing only values
	System.out.println(map.values());
	//printing only entry values
	System.out.println(map.entrySet());

	HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>(10,0.5f);
	hmap.put(1, 100);
	hmap.put(2, 100); //values can be duplicated
	hmap.put(5, 50);
	hmap.put(3, 800);
	hmap.put(9, 1240);
	hmap.put(2, 44);
	hmap.put(2, 34); //The value which is assigned last to the key will be printed
	System.out.println(hmap); //keys can not be duplicated
	
	System.out.println(hmap.containsKey(10));
	System.out.println(hmap.containsValue(100));
	//hashmap values won't follow any sorting order
	
	//Using iterator on map, with the help of set
	
	Set<Entry<Integer,Integer>>set=hmap.entrySet();
	Iterator<Entry<Integer,Integer>> itr=set.iterator();
	
	while(itr.hasNext())
		System.out.println(itr.next());
	//Hashmap value will return according to the key value
	
	LinkedHashMap<Integer,String>lmap=new LinkedHashMap<Integer,String>();
	lmap.put(23, "abc");
	lmap.put(67, "ijk");
	lmap.put(44, "def");
	System.out.println(lmap);
	
	TreeMap<Integer,Integer> tmap=new TreeMap<Integer,Integer>();
	tmap.put(56, 89);
	tmap.put(55, 134);
	tmap.put(58, 77);
	System.out.println(tmap);
	System.out.println(tmap.ceilingEntry(57));
	System.out.println(tmap.floorEntry(57));
	System.out.println(tmap.floorKey(57));
    System.out.println(tmap.ceilingKey(57));
    System.out.println(tmap.firstEntry());
    System.out.println(tmap.lastEntry());
    System.out.println(tmap.firstKey());
    System.out.println(tmap.lastKey());
	
    NavigableMap<Integer,Integer>nmap=tmap.descendingMap();
    //Descending map has the reference of the Navigable map
    System.out.println(nmap);
     
    Set<Entry<Integer,Integer>> set1=tmap.entrySet();
    System.out.println(nmap); */
    
    Properties properties=new Properties();
    System.out.println(properties);
    properties=System.getProperties();  //getProperties are static method using the class name it is accessed
    System.out.println(properties);
    
    Set<Entry<Object,Object>> setProperties=properties.entrySet();
    Iterator itr=setProperties.iterator();
    while(itr.hasNext())
    	System.out.println(itr.next());
    
    System.out.println(properties.getProperty("user.name"));
           properties.setProperty("OwnerName", "Nitish Kumar K M");
           while(itr.hasNext())
        	   System.out.println(itr.next());
    
  }
}
