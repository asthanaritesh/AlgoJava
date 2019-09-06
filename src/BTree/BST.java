package BTree;

import Utility.BTreePrinter;
import Utility.BTreePrinter2;

public class BST {
	Node root;
	public BST() {
		root = null;
	}
	Node getRoot() {
		return root;
	}
	
	// just to print sorted list
	private void inOrder(Node node) {
		if (node == null) return;
		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);
	}
    int minValue(Node root) { 
        int minv = root.data; 
        while (root.left != null) { 
            minv = root.left.data; 
            root = root.left; 
        } 
        return minv; 
    }
	// Node Search
	void search(int val){
		if (search(root,val) != null)
			System.out.println("Found !!");
		else System.out.println("Not Found !!");
	}
	public Node search(Node root, int val) 
	{ 
	    // Base Cases: root is null or data is present at root 
	    if (root==null || root.data==val) 
	        return root; 	  
	    // val is greater than root's data 
	    if (val > root.data) 
	        return search(root.right, val);
	    // val is less than root's data 
	    else
	    	return search(root.left, val); 
	} 
	
    // For Node Insertion
    void insert(int val) { 
       root = insertData(root, val); 
    } 
	public Node insertData(Node root, int val) {
		if (root == null) {
			root = new Node(val);
			return root;
		}			
		if (val < root.data) 
			root.left = insertData(root.left, val); 
		else if (val > root.data) 
			root.right = insertData(root.right, val); 
		else // Duplicate data not allowed 
			System.out.println("Duplicate Data not allowed, so skipping: "+ val);
		return root;
	}
	// For Node deletion
	public void delete(int val){
		deleteData(root, val);
	}
	public Node deleteData(Node root, int val){
        /* Base Case: If the tree is empty */
        if (root == null)  {
        	System.out.println("Not Found");
        	return root; 
        }
        /* Otherwise, recur down the tree */
        if (val < root.data) 
            root.left = deleteData(root.left, val); 
        else if (val > root.data) 
            root.right = deleteData(root.right, val); 
        // if val is same as root's data, then This is the node  to be deleted 
        else { 
            // node with only one child or no child 
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left; 
            // node with two children: Get the inorder successor (smallest in the right subtree) 
            root.data = minValue(root.right); 
            // Delete the inorder successor 
            root.right = deleteData(root.right, root.data); 
        } 
        return root; 
	}
	
	public static void main(String[] args) { 
		BST bst = new BST();
		bst.insert(5); bst.insert(1); bst.insert(10);bst.insert(4); bst.insert(8); bst.insert(3);
		BTreePrinter.print(bst.getRoot());
		bst.search(4);
		bst.inOrder(bst.getRoot());
		System.out.println();
		bst.delete(5);
		bst.inOrder(bst.getRoot());
		System.out.println();
		BTreePrinter.print(bst.getRoot());
	}
}
