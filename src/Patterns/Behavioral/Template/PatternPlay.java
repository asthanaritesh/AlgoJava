package Patterns.Behavioral.Template;

public class PatternPlay {
	public static void main (String[] args) {
		HouseTemplate h1 = new HouseGlass();
		HouseTemplate h2 = new HouseConcrete();
		h1.buildHouse();
		h2.buildHouse();
	}
}
