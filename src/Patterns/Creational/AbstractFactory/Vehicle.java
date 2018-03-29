package Patterns.Creational.AbstractFactory;

public abstract class Vehicle {
	int wheelsCount;
	String name;
	public int getWheels() {
		return wheelsCount;
	};
	public String getName() {
		return name;
	};
	public void printDetails() {
		System.out.println("I am a "+ name +" and wheels count is "+ wheelsCount);
	}
}

class TwoWheeler extends Vehicle {
	public TwoWheeler() {
		wheelsCount = 2;
		name = "2-Wheeler";
	}
}

class ThreeWheeler extends Vehicle {
	public ThreeWheeler() {
		wheelsCount = 3;
		name = "3-Wheeler";
	}
}

class FourWheeler extends Vehicle {
	public FourWheeler() {
		wheelsCount = 4;
		name = "4-Wheeler";
	}
}