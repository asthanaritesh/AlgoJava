package Patterns.Behavioral.State;


public interface State {

 public void insertCoin()throws Exception;
 public void pressButton()throws Exception;
 public void dispense()throws Exception;
}

//No coin inserted

class NoCoinInsertedState implements State{
 VendingMachine machine;
 public NoCoinInsertedState(VendingMachine machine) {
     this.machine =  machine;
 }
 public void insertCoin() throws Exception{
     if (!machine.isEmpty()) {
    	 System.out.println("Coin Inserted");
         machine.setMachineState(machine.getConinInsertedState());
     }
     else {
         throw new Exception("Can not process request .. Machine is out of stock");
     }
 }
 public void pressButton() throws Exception{
     throw new Exception("No coin inserted ..");
 }
 public void dispense() throws Exception{
     throw new Exception("Invalid Operation");
 }
}

class CoinInsertedState implements State{
 VendingMachine machine =null;
 public CoinInsertedState(VendingMachine machine) {
     this.machine =  machine;
 }
 public void insertCoin() throws Exception{
     throw new Exception("Coin is already inserted.");
 }
 public void dispense() throws Exception{
     throw new Exception("Dispense button is not pressed.");

 }
 public void pressButton() throws Exception{
	 System.out.println("Pressed Button");
     machine.setMachineState(machine.getDispensingState());
 }
}

//Dispensing Merchandise
class DispensingState implements State{
 VendingMachine machine ;
 DispensingState(VendingMachine machine) {
     this.machine = machine;
 }
 public void insertCoin() throws Exception {
     throw new Exception("wait ... previous order is processing");
 }
 public void pressButton() throws Exception {
     throw new Exception("wait ... previous order is processing");
 }
 public void dispense() throws Exception {
	 System.out.println("Dispensing");
     machine.setMachineState(machine.getNoCoinInsertedState());
 }
}

//Nothing in machine (Empty)
class EmptyState implements State{
 VendingMachine machine;
 public EmptyState(VendingMachine machine) {
     this.machine =  machine;
 }
 public void insertCoin() throws Exception{
	 System.out.println("Machine is Empty");
     throw new Exception("Can not process the request");
 }
 public void pressButton() throws Exception{
	 System.out.println("Machine is Empty");
     throw new Exception("Invalid Action");
 }
 public void dispense() throws Exception{
	 System.out.println("Machine is Empty");
     throw new Exception("Invalid Action");
 }
}