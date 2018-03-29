package Patterns.Creational.Builder;

public class PlayPattern {
	public static void main (String[] args) {
		VehicleBuilder vb1 = new VehicleBuilder("Car");
		vb1.setWheelsCount(4);
		vb1.setEngineCC(1000);
		vb1.setEngineHP(100);
		vb1.setIsAirbagEnabled(true);
		vb1.setIsDiscBrakeEnabled(false);
		Vehicle v1 = vb1.build();
		v1.printDetails();
		
		VehicleBuilder vb2 = new VehicleBuilder("Bike");
		vb2.setWheelsCount(2);
		vb2.setEngineCC(100);
		vb2.setEngineHP(10);
		vb2.setIsAirbagEnabled(false);
		vb2.setIsDiscBrakeEnabled(true);
		Vehicle v2 = vb2.build();
		v2.printDetails();
	}
}
