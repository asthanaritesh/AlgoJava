package Patterns.Creational.Builder;

public class Vehicle {
	private String name;
	private int wheelsCount;
	private int EngineCC;
	private int EngineHP;
	private boolean isDiscBrakeEnabled;
	private boolean isAirbagEnabled;
	
	//make it private so that no one can create objects directly.
	private Vehicle(VehicleBuilder vb) {
		name = vb.getName();
		wheelsCount = vb.getWheelsCount();
		EngineCC = vb.getEngineCC();
		EngineHP = vb.getEngineHP();
		isDiscBrakeEnabled = vb.getIsDiscBrakeEnabled();
		isAirbagEnabled = vb.getIsAirbagEnabled();
	};
	public static Vehicle createVehicle(VehicleBuilder vb) {
		return new Vehicle(vb);
	}
	public void printDetails() {
		System.out.println("I am a "+ name +" and wheels count is "+ wheelsCount);
		System.out.println("Engine CC is "+ EngineCC +" and Engine HP is "+ EngineHP);
		System.out.println("DiscBrake is Enabled? "+ isDiscBrakeEnabled +" and AirBag Enabled is "+ isAirbagEnabled);
	}
}

