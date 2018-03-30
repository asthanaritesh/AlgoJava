package Patterns.Behavioral.ChainOfResponsibility;
import Utility.Input;

class ATMDispenser {
	private DispenseChain c1;
	public ATMDispenser() {
		c1 = new Dispenser2000();
		DispenseChain c2 = new Dispenser500();
		DispenseChain c3 = new Dispenser100();
		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}
	public void dispense(int amount) {
		c1.dispense(amount);
	}
	public static void main(String[] args) {
		int amount = Input.singleInt();
		if (amount%100 != 0) {
			System.err.println("Can not Dispense!! Amount should be in multiple of Rs 100");
		} else {
			ATMDispenser dispenser = new ATMDispenser();
			dispenser.dispense(amount);
		}
	}
}
