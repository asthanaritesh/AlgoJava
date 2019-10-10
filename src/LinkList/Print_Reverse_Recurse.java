package LinkList;

import Utility.Input;

public class Print_Reverse_Recurse {
		
	public static void print(Node node) {
		if (node != null)
			System.out.print(node.data);
		if (node.next != null) {
			System.out.print(" -> ");
			print(node.next);
		}
	}

	public static void printReverse(Node node) {
		if (node.next != null)
			printReverse(node.next);
		System.out.print(node.data + " <- ");
	}
	
	public static Node reverse(Node node) 
    { 
        Node prev = null; 
        Node current = node; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        node = prev; 
        return node; 
    } 
	
	public static void main(String[] args) {
		LinkList list = new LinkList (Input.arrayOfInts());
		print(list.getRoot());
		System.out.println();
		printReverse(list.getRoot());
		System.out.println();
		Node reversed = reverse(list.getRoot());
		print(reversed);
	}
}
