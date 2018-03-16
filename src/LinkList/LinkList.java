package LinkList;

import Utility.Input;

public class LinkList {

	public Node root;
	
	public LinkList(Node node) {
		this.root = node;
	}
	
	public Node getRoot() {
		return root; 
	}
	
	public int length() {
		int len=0;
		Node node = root;
		while(node != null) {			
			len++;
			node = node.next;
		}
		return len;
	}
	
	public LinkList (int[] iArray)
	{
		Node curNode = null;
		if(iArray.length>0) {
			root = new Node(iArray[0]);
			curNode = root;
		}
		else root=null;
		for (int i=1; i<iArray.length; i++) {
			Node nextNode = new Node(iArray[i]);
			curNode.next = nextNode;
			curNode = nextNode;
		}
		curNode.next=null;
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
	
	public void print() {
		System.out.println("Printing the LinkList: ");
		Node node = root;
		while(node != null) {
			if(node!=root) System.out.print(" -> ");
			System.out.print(node.data);
			node=node.next;
		}		
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")	LinkList list1 = constructList();
		@SuppressWarnings("unused")	int[] input1 = {1,2,3,4,5,6,7,8,9,10};
		int[] input2 = Input.arrayOfInts();
		LinkList list2 = new LinkList(input2);
		Node root = list2.getRoot();
		System.out.println("print Called: ");
		list2.print();
		System.out.println("\nLength is: "+list2.length());
		System.exit(0);
	}
}
