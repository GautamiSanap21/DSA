package com.demo.test;

import com.demo.list.DoublyCircularLinkedList;

public class TestDoublyCircularLinkedList {

	public static void main(String[] args) {
		DoublyCircularLinkedList dcll = new DoublyCircularLinkedList();
		dcll.addAtEnd(21);
		dcll.addAtEnd(10);
		dcll.addAtEnd(65);
		dcll.addAtEnd(23);
		dcll.displayData();
	}

}
