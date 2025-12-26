package com.demo.test;

import com.demo.queue.QueueUsingLinkedList;

public class TestQueueLinkedList {

	public static void main(String[] args) {
		QueueUsingLinkedList q = new QueueUsingLinkedList();
		q.enqueue(11);
		q.enqueue(12);
		q.enqueue(13);
		q.enqueue(14);
		System.out.println(q.dequeue());
		

	}

}
