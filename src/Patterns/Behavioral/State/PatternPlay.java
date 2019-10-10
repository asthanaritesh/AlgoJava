package Patterns.Behavioral.State;
//import Patterns.Behavioral.State.VendingMachine;

public class PatternPlay {
	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		try {
//			vm.insertCoin();
			vm.reFill(10);
			vm.insertCoin();
			vm.pressButton();
			}
		catch (Exception e){
			System.out.println(e.getMessage());		
		}
	}
}
