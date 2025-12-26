package com.demo.test;

import com.demo.stack.StackUsingLinkedList;

public class TestStackLinkedList {

	public static void main(String[] args) {
		StackUsingLinkedList sll = new StackUsingLinkedList();
		sll.push(12);
		sll.push(13);
		sll.push(14);
		sll.push(15);
		sll.push(16);
		System.out.println(sll.pop());

	}

}
