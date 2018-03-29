package Patterns.Creational.AbstractFactory;

public interface AbstractFactory {
	Vehicle createVehicle();
}

class TwoWheelerFactory implements AbstractFactory{
	@Override
	public Vehicle createVehicle() {
		return new TwoWheeler();
	}
}

class ThreeWheelerFactory implements AbstractFactory{
	@Override
	public Vehicle createVehicle() {
		return new ThreeWheeler();
	}
}

class FourWheelerFactory implements AbstractFactory{
	@Override
	public Vehicle createVehicle() {
		return new FourWheeler();
	}
}