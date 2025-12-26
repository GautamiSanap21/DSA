package com.demo.sort;

import java.util.Arrays;

public class SelectionSort {
	public static void selectionSort(int arr[]) {
		for (int i = 0; i < arr.length-1; i++) {
			int minpos = findNthMin(arr,i);
			int temp = arr[i];
			arr[i]=arr[minpos];
			arr[minpos] = temp;
			System.out.println(Arrays.toString(arr));
		}
	}

	private static int findNthMin(int[] arr, int start) {
		int minpos = start;
		int min = arr[minpos];
		for (int i = start; i < arr.length; i++) {
			if (min>arr[i]) {
				minpos = i;
				min = arr[i];
			}
			
		}
		return minpos;
	}
}
