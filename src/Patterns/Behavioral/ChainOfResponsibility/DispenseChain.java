package Patterns.Behavioral.ChainOfResponsibility;

public interface DispenseChain {	
	void setNextChain(DispenseChain chain);
	void dispense(int amount);
}

class Dispenser2000 implements DispenseChain {
	DispenseChain nextChain;
	public void setNextChain(DispenseChain chain) {
		nextChain = chain;
	}
	public void dispense(int amount) {
		int remain;
		if (amount >= 2000)
			System.out.println("Dispensing "+ amount/2000 + " notes of "+ 2000);
		remain = amount%2000;
		if (remain !=0) nextChain.dispense(remain);
	}
}

class Dispenser500 implements DispenseChain {
	DispenseChain nextChain;
	public void setNextChain(DispenseChain chain) {
		nextChain = chain;
	}
	public void dispense(int amount) {
		int remain;
		if (amount >= 500)
			System.out.println("Dispensing "+ amount/500 + " notes of "+ 500);
		remain = amount%500;
		if (remain !=0) nextChain.dispense(remain);
	}
}

class Dispenser100 implements DispenseChain {
	DispenseChain nextChain = null;
	public void setNextChain(DispenseChain chain) {
		nextChain = chain;
	}
	public void dispense(int amount) {
		if (amount >= 100)
			System.out.println("Dispensing "+ amount/100 + " notes of "+ 100);
	}
}