package Patterns.Creational.AbstractFactory;

import Patterns.Creational.AbstractFactory.Vehicle;

public class PlayPattern {
	public static void main (String[] args) {
		AbstractFactory fct2 = new TwoWheelerFactory();
		AbstractFactory fct3 = new ThreeWheelerFactory();
		AbstractFactory fct4 = new FourWheelerFactory();
		Vehicle v1 = fct2.createVehicle();
		Vehicle v2 = fct3.createVehicle();
		Vehicle v3 = fct4.createVehicle();
		v1.printDetails();
		v2.printDetails();
		v3.printDetails();		
	}
}