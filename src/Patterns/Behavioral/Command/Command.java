package Patterns.Behavioral.Command;

public interface Command {
	   void execute();
}

class BuyCommand implements Command {
	   private Stock stk;
	   public BuyCommand(Stock stock){
	      this.stk = stock;
	   }
	   public void execute() {
		   stk.buy();
	   }
	}

	class SellCommand implements Command {
	   private Stock stk;
	   public SellCommand(Stock stock){
	      this.stk = stock;
	   }
	   public void execute() {
		   stk.sell();
	   }
	}