package LinkList;

import java.util.Scanner;

import Utility.Input;

public class LinkList {

	public Node root;
	
	public LinkList(Node node) {
		this.root = node;
	}
	public Node getRoot() {
		return root; 
	}
	public void print(Node node) {
		if (node!= null) 
			System.out.print(node.data);
		if(node.next != null) {
			System.out.print(" --> ");
			print(node.next);
		}
	}
	
	public void printReverse(Node node) {
		if (node.next != null)
			printReverse(node.next);
		System.out.print(node.data + " <-- ");
	}
	
	public static LinkList constructFromArray(int[] iArray)
	{
		LinkList list = null;
		Node curNode = null;
		if(iArray.length>0) {
			Node root = new Node(iArray[0]);
			list = new LinkList(root);
			curNode = root;
		} else return null;
		for (int i=1; i<iArray.length; i++) {
			Node nextNode = new Node(iArray[i]);
			curNode.next = nextNode;
			curNode = nextNode;
		}
		return list;
	}
	
	static LinkList constructList() {
		Node root = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		Node sixth = new Node(6);
		Node seventh = new Node(7);
		Node eight = new Node(8);
		Node ninth = new Node(9);
		Node tenth = new Node(10);
		root.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
		seventh.next = eight;
		eight.next = ninth;
		ninth.next = tenth;
		LinkList list = new LinkList(root);
		return list;
	}
	
	public static void main(String[] args) {
		//int[] input = {1,2,3,4,5,6,7,8,9,10};
		int[] input = Input.arrayOfInt();
		LinkList list = constructFromArray(input);
		//LinkList list = constructList();
		Node root = list.getRoot();
		System.out.print("print Called: \n");
		list.print(root);
		System.out.print("\nprintReverse Called: \n");
		list.printReverse(root);
	}
}
