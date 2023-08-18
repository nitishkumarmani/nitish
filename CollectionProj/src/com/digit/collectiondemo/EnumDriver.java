package com.digit.collectiondemo;

public class EnumDriver {
	enum MyColor{
		RED,BLUE,GREEN,YELLOW;
	}
   public static void main(String[] args) {
     MyColor mycolor= MyColor.RED;
     System.out.println(mycolor.name());
     System.out.println(mycolor.ordinal());
     
   }
	
}
