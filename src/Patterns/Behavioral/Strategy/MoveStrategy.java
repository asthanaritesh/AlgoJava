package Patterns.Behavioral.Strategy;

public interface MoveStrategy {
	void move();
}

class flyingHigh implements MoveStrategy {
	@Override
	public void move() {
		System.out.println(" I am flying high");		
	}
}

class flyingLow implements MoveStrategy {
	@Override
	public void move() {
		System.out.println(" I am flying low");		
	}
}

class runningFastOnGround implements MoveStrategy {
	@Override
	public void move() {
		System.out.println(" I am Running fast on Ground");		
	}
}

class runningSlowOnGround implements MoveStrategy {
	@Override
	public void move() {
		System.out.println(" I am Running slow on Ground");		
	}
}

class swimmingInWater implements MoveStrategy {
	@Override
	public void move() {
		System.out.println(" I am Swimming in Water");		
	}
}