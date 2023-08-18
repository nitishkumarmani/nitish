package com.digit.collectiondemo;

import java.util.Arrays;
import java.util.List;
public class DemoOnArrays {
    public static void main(String[] args) {
	 int arr[]= {45,23,78,66,12,90};
	 Arrays.sort(arr);
	 for(Integer i:arr)
		 System.out.println(i);
	 
	 System.out.println("Searched element is present at the index: "+Arrays.binarySearch(arr, 45));
	 
	 System.out.println(arr[2]);

	 List<int[]> list=Arrays.asList(arr);
	 System.out.println(list.size());
	 //for(Integer i:arr)
		// System.out.println(i);
	}
}
