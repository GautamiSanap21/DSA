package com.demo.tree;

public class BinarySearchTree {
	Node root;

	class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	public BinarySearchTree() {
		root = null;
	}

	public void inserNode(int val) {
		root = insertData(root, val);
	}

	private Node insertData(Node root, int val) {
		Node newnode = new Node(val);
		if (root == null) {
			root = newnode;
			return root;
		} else {
			if (val < root.data) {
				root.left = insertData(root.left, val);
			} else {
				root.right = insertData(root.right, val);
			}
			return root;
		}
	}

	public void inorder() {
		inorderTraversal(root);
	}

	private void inorderTraversal(Node root) {
		if (root != null) {
			inorderTraversal(root.left);
			System.out.println(root.data);
			inorderTraversal(root.right);
		}
	}

	public void preorder() {
		inorderTraversal(root);
	}

	private void preorderTraversal(Node root) {
		if (root != null) {
			System.out.println(root.data);
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
	}

	public void postorder() {
		inorderTraversal(root);
	}

	private void postorderTraversal(Node root) {
		if (root != null) {
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			System.out.println(root.data);
		}

	}

}
