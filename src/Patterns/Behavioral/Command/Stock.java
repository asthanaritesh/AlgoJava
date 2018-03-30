package Patterns.Behavioral.Command;

public class Stock {
	private String name = "APPLE";
	private int quantity = 10;

	Stock(String nameStk, int qty) {
		name = nameStk;
		quantity = qty;
	}
	public void buy() {
		System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] bought");
	}

	public void sell() {
		System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] sold");
	}
}


