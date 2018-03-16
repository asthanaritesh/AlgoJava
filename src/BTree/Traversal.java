package BTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import Utility.BTreePrinter;
import Utility.Input;

public class Traversal {

	private static void preOrder(Node node) {
		if (node == null) return;
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	private static void inOrder(Node node) {
		if (node == null) return;
		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);
	}

	private static void postOrder(Node node) {
		if (node == null) return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + " ");
	}

	private static void breadthTraversal(Node node) {
		if (node == null) return;
		Queue<Node> queue= new LinkedList<Node>();
		queue.offer(node);		
		while(!queue.isEmpty()) {
			Node next = queue.poll();
			System.out.print(next.data + " ");
			if(next.left != null) queue.offer(next.left);
			if(next.right != null) queue.offer(next.right);
		}
	}
	
	private static int numOfNodes(Node node) {
		if (node == null)
			return 0;
		else
			return numOfNodes(node.left) + 1 + numOfNodes(node.right);
	}

	private static int height(Node node) {
		if (node == null)
			return 0;
		else {
			int leftHeight = height(node.left) + 1;
			int rightHeight = height(node.right) + 1;
			return Math.max(leftHeight, rightHeight);
		}
	}

	private static boolean hasPathSum(Node node, int sum) {
		if (node == null)
			return (sum == 0);
		else {
			int remSum = sum - node.data;
			return (hasPathSum(node.left, remSum) || hasPathSum(node.right, remSum));
		}
	}

	private static boolean pathSumRootToLeaf(Node node, int sum, Stack<Integer> st) {
		if (node == null) {
			return (sum == 0);
		} else {
			int remSum = sum - node.data;
			if (pathSumRootToLeaf(node.left, remSum, st) || pathSumRootToLeaf(node.right, remSum, st)) {
				st.push(node.data);
				return true;
			}
		}
		return false;
	}

	private static boolean pathSum(Node node, int sum, Stack<Integer> st) {
		if (sum == 0)
			return true;
		else if (node == null)
			return false;
		else {
			int remSum = sum - node.data;
			if (pathSum(node.left, remSum, st) || pathSum(node.right, remSum, st)) {
				st.push(node.data);
				return true;
			}
		}
		return false;
	}

	public static LinkedList<Integer> reverse(Stack<Integer> st) {
		LinkedList<Integer> lnkCopy = new LinkedList<Integer>();
		while (!st.empty()) {
			lnkCopy.add((int) st.pop());
		}
		return lnkCopy;
	}

	public static void main(String[] args) {
		Node root = BTreePrinterTest.test1();
		BTreePrinter.print(root);
		System.out.println("Preorder Traversal:");
		preOrder(root);
		System.out.println("\nInorder Traversal:");
		inOrder(root);
		System.out.println("\nPostorder Traversal:");
		postOrder(root);
		System.out.println("\nBreadth Traversal:");
		breadthTraversal(root);
		System.out.println("\nTotal number of nodes: " + numOfNodes(root));
		System.out.println("\nMax Depth is: " + height(root));
		System.out.println("Path Sum Needed: ");
		int sum = Input.singleInt();
		System.out.println("\nHas Path Sum: " + Boolean.toString(hasPathSum(root, sum)));
		Stack<Integer> st = new Stack<Integer>();
		System.out.println("\n Path (Only Root to Leaf) having sum: ");
		pathSumRootToLeaf(root, sum, st);
		System.out.println(reverse(st));
		st.empty();
		System.out.println("\n Path (From Root) having sum: ");
		pathSum(root, sum, st);
		System.out.println(reverse(st));
	}

}
