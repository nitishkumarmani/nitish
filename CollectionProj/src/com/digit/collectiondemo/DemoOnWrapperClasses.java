package com.digit.collectiondemo;

public class DemoOnWrapperClasses {
  public static void main(String args[]) {
	  int i=45;
	  Integer I=i; //autoboxing
	  System.out.println(I.hashCode());
	  
	  Double D=45.678;
	  double d=D; //unboxing wrapper object to its primitive type
	  
	  d=D.doubleValue();//retriving data from object to its primitive 
	  System.out.println("Primitive double value from its wrapper double:"+d);
	  
	  String intString=I.toString();//converting object to string
	  String myIntStr="456";
	  Integer myInt=Integer.parseInt(myIntStr); //converting string to its corresponding object
      System.out.println("String to Integer Object: "+myInt);
  }
}
