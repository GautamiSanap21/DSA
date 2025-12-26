package com.demo.test;

import com.demo.list.SinglyCircularLinkedList;

public class TestSinglyCircularLinkedList {

	public static void main(String[] args) {
		SinglyCircularLinkedList scll = new SinglyCircularLinkedList();
		scll.addNode(10);
		scll.addNode(20);
		scll.addNode(30);
		scll.addNode(40);
		scll.displayData();
//		scll.addByPosition(1, 100);
//		scll.addByPosition(3, 200);
//		scll.addByPosition(7, 300);
//		scll.displayData();
		scll.addByValue(400, 10);
		scll.addByValue(500, 40);
		scll.addByValue(600, 50);
		scll.displayData();
		scll.deleteByValue(600);
		scll.displayData();
		scll.delteByPosition(4);
		scll.displayData();
	}

}
