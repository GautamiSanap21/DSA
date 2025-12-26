package com.demo.test;

import com.demo.tree.BinarySearchTree;

public class TestBST{

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.inserNode(50);
		bst.inserNode(90);
		bst.inserNode(87);
		bst.inserNode(100);
		bst.inserNode(34);
		bst.inserNode(12);
		System.out.println("Preorder Traversal");
		bst.preorder();
		System.out.println("Inorder Traversal");
		bst.inorder();
		System.out.println("Postorder Traversal");
		bst.postorder();
	}

}
