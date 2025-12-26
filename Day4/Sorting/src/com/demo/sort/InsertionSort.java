package com.demo.sort;

import java.util.Arrays;

public class InsertionSort {
	public static void insertionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int j = i-1;
			int k = arr[i];
			while (j>=0 && arr[j]>k) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = k;
			System.out.println(Arrays.toString(arr));
		}
		
	}
}
