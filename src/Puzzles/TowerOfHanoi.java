package Puzzles;

import Utility.Input;

/*Take an example for only 2 discs : A and B
Let three stacks = 'source', 'aux' and 'dest'.

Step 1 : Shift disc 'A' from 'source' to 'aux'.
Step 2 : Shift disc 'B' from 'source' to 'dest'.
Step 3 : Shift disc 'A' from 'aux' to 'source'.

The pattern here is :
Shift 'n-1' disks from 'source' to 'aux'.
Shift last disk from 'source' to 'dest'.
Shift 'n-1' disks from 'aux' to 'source'.*/

public class TowerOfHanoi {
	public static Stack source;
	public static Stack dest;
	public static Stack aux;
	public final char[] DiscName = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
	
	public TowerOfHanoi(int n) {
		source = new Stack("Source");
		aux = new Stack("Aux");
		dest = new Stack("Dest");
		for(int i=n; i>0; i--) {
			Node disc = new Node(DiscName[i-1]);
			source.push(disc);
		}
	}
	
	public class Stack {
		Node top;
		String name;
		public Stack(String str) {top = null; name = str;}
		public String getName(){return name;}
		public void push(Node disc) {
			if(disc != null) {
				disc.next=top; 
				top = disc;
			}
		}
		public Node pop() {
			if(top == null) return null;
			else {
				Node temp = top;
				top = top.next;
				return temp;
			}
		}
	}
	
	public class Node {
		char data;
		Node next;
		public Node(char n) {
			data = n;
		}
	}
	
	static void printRec(Node nextNode) {
		if (nextNode.next != null) printRec(nextNode.next);
		System.out.print(nextNode.data + " ");
		
	}
	public static void printTower() {		
		Node nextNode = source.top;
		System.out.print("Source: ");
		if(nextNode!=null) printRec(nextNode);
		nextNode = aux.top;
		System.out.print("\nAux   : ");
		if(nextNode!=null) printRec(nextNode);
		nextNode = dest.top;
		System.out.print("\nDest  : ");
		if(nextNode!=null) printRec(nextNode);
		System.out.println();
		System.out.flush();
	}
	
	private static void PushFromTo(Stack source, Stack dest) {
		System.out.println("\nMoving " + source.top.data + " from " + source.getName() + " to " + dest.getName());
		dest.push(source.pop());
		printTower();		
	}
	
	public static void solveTower(int n, Stack source, Stack aux, Stack dest) {
		if (n == 1) {
			PushFromTo(source, dest);
		} else {
			solveTower(n-1, source, dest, aux);
			PushFromTo(source, dest);
			solveTower(n-1, aux, source, dest);
		}
	}
	
	public static void main(String args[]) {
		System.out.println("How many disc you want to put on the source stack?");
		int n = Input.singleInt();
		TowerOfHanoi tower = new TowerOfHanoi(n);
		printTower();
		solveTower(n, source, aux, dest);
	}
}
