package Patterns.Behavioral.Strategy;

public abstract class Animal {
	MoveStrategy myMoves;
	abstract void showMyMoves();
	void setMyMoves(MoveStrategy st) {
		myMoves = st;		
	}
}

class Dog extends Animal{
	public Dog(){
		myMoves = new runningFastOnGround();
	}
	void showMyMoves() {
		myMoves.move();
	}

}

class Eagle extends Animal {
	public Eagle(){
		myMoves = new flyingHigh();
	}
	void showMyMoves() {
		myMoves.move();		
	}
}

