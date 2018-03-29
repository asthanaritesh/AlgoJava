package Patterns.Behavioral.Strategy;

public class PatternPlay {
	public static void main(String[] args){
		Animal tommy = new Dog();
		tommy.showMyMoves();
		MoveStrategy newStr = new runningSlowOnGround();
		tommy.setMyMoves(newStr);
		tommy.showMyMoves();
		Animal spoofy = new Eagle();
		spoofy.showMyMoves();
		newStr = new flyingLow();
		tommy.setMyMoves(newStr);
		tommy.showMyMoves();
	}
}
