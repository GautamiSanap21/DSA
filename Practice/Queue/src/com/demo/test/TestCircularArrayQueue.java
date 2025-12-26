package com.demo.test;

import com.demo.circularQueue.CircularQueueUsingArray;

public class TestCircularArrayQueue {

	public static void main(String[] args) {
		CircularQueueUsingArray q = new CircularQueueUsingArray(5);
		q.displayData();
		q.enQueue(100);
		q.enQueue(200);
		q.enQueue(300);
		q.enQueue(400);
		q.enQueue(500);
		q.enQueue(600);
		q.enQueue(700);
		q.enQueue(800);
		q.displayData();
		q.deQueue();
		q.deQueue();
		q.displayData();
		q.enQueue(60);
		q.enQueue(70);
		q.enQueue(80);
		System.out.println("=======================");
		q.displayData();
	}

}
