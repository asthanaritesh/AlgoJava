package Patterns.Behavioral.Command;

public class PlayPattern {
	public static void main(String[] args) {
		Stock stk1 = new Stock("APPL", 10);
		BuyCommand buyStockOrder = new BuyCommand(stk1);
		Stock stk2 = new Stock("GOOG", 20);
		SellCommand sellStockOrder = new SellCommand(stk2);

		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);

		broker.placeOrders();
	}
}
