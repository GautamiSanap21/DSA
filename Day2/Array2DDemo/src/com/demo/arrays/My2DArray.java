package com.demo.arrays;

import java.util.Scanner;
public class My2DArray {
	private int[][] arr;
	public My2DArray() {
		arr = new int[3][3];
		
	}
	
	public My2DArray(int rows,int columns) {
		arr = new int[rows][columns];
	}
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.println("Enter value "+i+","+j);
				arr[i][j] = sc.nextInt();
			}
		}
	}
	
	public void displayData() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.println(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public int[] findSumRowwise() {
		int[] sumrows = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				sumrows[i] += arr[i][j];
			}
		}
		return sumrows;
	}
	
	public int[] findSumColumnwise() {
		int[] sumrows = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				sumrows[i] += arr[i][j];
			}
		}
		return sumrows;
	}
	
	public int[][] rowRotation(boolean flag,int num){
		if(flag){
			for(int cnt=0;cnt<num;cnt++) {
				int[] temp = arr[0];
				for(int i=0;i<arr.length-1;i++) {
					arr[i] = arr[i+1];
				}
				arr[arr.length-1] = temp;
			}
		}else {
			for(int cnt=0;cnt<num;cnt++) {
				int[] temp = arr[arr.length-1];
				for(int i=arr.length-1;i>0;i--) {
					arr[i] = arr[i-1];
				}
				arr[0] = temp;
			}
		}
		return arr;
	}
	
	public int[][] colRotation(boolean flag,int num){
		if(flag) {
			for(int cnt=0;cnt<num;cnt++) {
				int[] temp = new int[arr.length];
				
			}
		}
	}
}
