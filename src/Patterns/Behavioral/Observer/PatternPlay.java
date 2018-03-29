package Patterns.Behavioral.Observer;

public class PatternPlay {

	public static void main(String[] args) {
		Model mod = new Model(1);
		Observer obs1 = new View2D("2D");
		Observer obs2 = new View3D("3D");
		Observer obs3 = new ViewWireFrame("WireFrame");
		obs1.listenTo(mod); obs2.listenTo(mod); obs3.listenTo(mod);
		mod.changeValue(2);
		obs1.stopListening(mod);
		mod.changeValue(3);
	}
}
