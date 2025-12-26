package com.demo.test;
import java.util.Scanner;

import com.demo.array.OneDArray;

public class TestOneDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size Of Array: ");
		int size = sc.nextInt();
		System.out.println("Enter Array Elements:");
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		OneDArray a = new OneDArray();
//		System.out.println(a.addition(arr));
		int[] arr1=a.addDigits(arr);
		for (int i = 0; i < arr1.length; i++) {
			
			System.out.println(arr1[i]);
		}

	}

}
