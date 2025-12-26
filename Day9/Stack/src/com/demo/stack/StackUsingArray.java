package com.demo.stack;

public class StackUsingArray {
	private int arr[];
	private int top;
	
	
	public StackUsingArray() {
		arr = new int[10];
		top = -1;
	}


	public StackUsingArray(int size) {
		arr = new int[size];
		top = -1;
	}
	
	
	public void push(int val) {
		if(!isfull()) {
			top++;
			arr[top] = val;
			System.out.println("Pushed "+val);
		}else {
			System.out.println("Statck is full...");
		}
	}
	
	public int pop() {
		if(!isempty()) {
			int num = arr[top];
			top--;
			return num;
		}else {
			System.out.println("Statck is empty...");
			return -1;
		}
	}


	private boolean isfull() {
		return top == arr.length-1;
	}
	
	private boolean isempty() {
		return top == -1;
	}
	
	
}
