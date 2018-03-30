package Patterns.Creational.Prototype;
//To create Car object we need to look database and find various attributes and finally create a object. Heavy object it is.
// we need to create many Cars object, however only Car Name and EngineCC are different.
class Car implements Cloneable{
	private String Name;
	private int EngineCC;
	// various other parameters to be fetched from db or other source which makes it heavy class.
	public Car() {
		// imagine db queries here.
		Name = "Honda";
		EngineCC = 1000;
	}
	public void setName(String cName) {
		Name = cName;
	}
	public void setEngineCC(int cc) {
		EngineCC = cc;
	}
	public void printDetails() {
		System.out.println("This Car name is "+Name+" and EngineCC is "+EngineCC);
	}
    // Here you can override clone method also. You can call Car's constructor also. (provided that is not the original one, create another constructor with arguments which just copy data from this object to new state)
	// super clone method is a protected method, so it becomes private here, so we need to override just to make it public so that can be called from outside.
	@Override
	protected Object clone() throws CloneNotSupportedException {
	    return super.clone();
	}
	
	public Car CreateClone(String name, int cc) throws CloneNotSupportedException {
		Car newCar = (Car) this.clone();
		newCar.setName(name);
		newCar.setEngineCC(cc);
		return newCar;
	}
}
