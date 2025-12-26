package com.demo.test;

import com.demo.sort.InsertionSort;
import com.demo.sort.QuickSort;

public class TestQuickSort {

	public static void main(String[] args){
		int arr[] = {45,1,34,2,78,9,5,90,4};
		QuickSort.quickSort(arr, 0, arr.length-1);
		
		System.out.println("=============================================");
		
		InsertionSort.insertionSort(arr);
	}
}
