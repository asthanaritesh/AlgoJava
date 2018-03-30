package Patterns.Behavioral.Command;

import java.util.ArrayList;
import java.util.List;

// Invoker
public class Broker {
	private List<Command> orderList = new ArrayList<Command>();

	public void takeOrder(Command cmd) {
		orderList.add(cmd);
	}

	public void placeOrders() {
		for (Command order : orderList) {
			order.execute();
		}
		orderList.clear();
	}
}
