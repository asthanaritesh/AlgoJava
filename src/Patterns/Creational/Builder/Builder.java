package Patterns.Creational.Builder;

class VehicleBuilder{
	private String name;
	private int wheelsCount;
	private int EngineCC;
	private int EngineHP;
	private boolean isDiscBrakeEnabled;
	private boolean isAirbagEnabled;
	
	public VehicleBuilder(String name) {
		this.name = name;
	}
	public void setName(int wheelsCount) {
		this.wheelsCount = wheelsCount;
	}
	public void setWheelsCount(int wheelsCount) {
		this.wheelsCount = wheelsCount;
	}
	public void setEngineCC(int EngineCC) {
		this.EngineCC = EngineCC;
	}
	public void setEngineHP(int EngineHP) {
		this.EngineHP = EngineHP;
	}
	public void setIsDiscBrakeEnabled(boolean isDiscBrakeEnabled) {
		this.isDiscBrakeEnabled = isDiscBrakeEnabled;
	}
	public void setIsAirbagEnabled(boolean isAirbagEnabled) {
		this.isAirbagEnabled = isAirbagEnabled;
	}
	public String getName() {
		return name;
	}
	public int getWheelsCount() {
		return wheelsCount;
	}
	public int getEngineCC() {
		return EngineCC;
	}
	public int getEngineHP() {
		return EngineHP;
	}
	public boolean getIsDiscBrakeEnabled() {
		return isDiscBrakeEnabled;
	}
	public boolean getIsAirbagEnabled() {
		return isAirbagEnabled;
	}
	public Vehicle build() {
		return Vehicle.createVehicle(this);
	}
}


