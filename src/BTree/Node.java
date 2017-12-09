package BTree;
import Utility.BTreePrinter2;
import Utility.Constants;

public class Node implements BTreePrinter2.PrintableNode {
    public Node left;
	public Node right;
    public int data;
    public String color=Constants.COLOR_WHITE_BG;

    public Node(int data) {
        this.data = data;
    }
    
    @Override
    public Node getRight() {
    	return this.right;
    }
    
    @Override
    public Node getLeft() {
    	return this.left;
    }

	@Override
	public String getText() {
		return Integer.toString(data);
	}
	
	public void printData() {
		System.out.print(this.color+this.data+Constants.COLOR_RESET);
	}
}
