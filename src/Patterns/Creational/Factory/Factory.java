package Patterns.Creational.Factory;

public class Factory {
	Vehicle createVehicle(int i) {
		if (i == 2) return new TwoWheeler();
		else if (i == 3) return new ThreeWheeler();
		return new FourWheeler();
	}
}
