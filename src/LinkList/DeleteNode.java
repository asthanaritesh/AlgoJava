package LinkList;

import Utility.Input;

public class DeleteNode {
	
	private static Node deleteNode(Node root, int delMe) {
		Node node = root, newRoot;
		if (node.data == delMe) {
			newRoot = node.next;
			node.next = null;
			return newRoot;
		}
		Node prevNode = node;
		node = node.next;
		while(node != null) {
			if(node.data == delMe) {
				prevNode.next = node.next;
				node.next = null;
			}
			prevNode = node;
			node = node.next;
		}
		return root;
	}
	
	public static void main(String[] args) {
		LinkList list = new LinkList(Input.arrayOfInts());
		System.out.println("Write the node to delete: ");
		int delMe = Input.singleInt();
		Node n = deleteNode(list.getRoot(), delMe);
		LinkList newList = new LinkList(n);
		newList.print();
	}
}
