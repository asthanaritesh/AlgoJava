package Patterns.Behavioral.Template;

abstract class HouseTemplate {
	public final void buildHouse(){
		buildLand();
		buildFoundation();
		buildWalls();
		buildWindows();
		buildCeilings();
		System.out.println("House is built.");
	}
	public void buildLand() {
		System.out.println("Building Common Land");
	}
	public void buildFoundation() {
		System.out.println("Building Common Foundation");
	}
	abstract void buildWalls();
	abstract void buildWindows();
	abstract void buildCeilings();
}

class HouseGlass extends HouseTemplate{
	void buildWalls() {
		System.out.println("Building Glass Walls");
	}
	void buildWindows() {
		System.out.println("Building Glass Windows");
	}
	void buildCeilings() {
		System.out.println("Building Glass Ceilings");
	}
}

class HouseConcrete extends HouseTemplate{
	void buildWalls() {
		System.out.println("Building Concrete Walls");
	}
	void buildWindows() {
		System.out.println("Building Concrete Windows");
	}
	void buildCeilings() {
		System.out.println("Building Concrete Ceilings");
	}
}
