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
	protected void buildLand() {
		System.out.println("Building Common Land");
	}
	protected void buildFoundation() {
		System.out.println("Building Common Foundation");
	}
	protected abstract void buildWalls();
	protected abstract void buildWindows();
	protected abstract void buildCeilings();
}

class HouseGlass extends HouseTemplate{
	protected void buildWalls() {
		System.out.println("Building Glass Walls");
	}
	protected void buildWindows() {
		System.out.println("Building Glass Windows");
	}
	protected void buildCeilings() {
		System.out.println("Building Glass Ceilings");
	}
}

class HouseConcrete extends HouseTemplate{
	protected void buildWalls() {
		System.out.println("Building Concrete Walls");
	}
	protected void buildWindows() {
		System.out.println("Building Concrete Windows");
	}
	protected void buildCeilings() {
		System.out.println("Building Concrete Ceilings");
	}
}
