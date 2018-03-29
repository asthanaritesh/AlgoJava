package Patterns.Creational.Factory;

public class PlayPattern {
	public static void main (String[] args) {
		Factory fct = new Factory();
		Vehicle v1 = fct.createVehicle(2);
		Vehicle v2 = fct.createVehicle(3);
		Vehicle v3 = fct.createVehicle(4);
		v1.printDetails();
		v2.printDetails();
		v3.printDetails();		
	}
}
