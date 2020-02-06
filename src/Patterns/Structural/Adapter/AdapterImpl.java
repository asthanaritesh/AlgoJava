package Patterns.Structural.Adapter;

//Java implementation of Adapter pattern 

interface Batting
{ 
	public void bat(); 
} 

class Batsman implements Batting 
{ 
	public void bat() 
	{ 
		System.out.println("I am Batting\n"); 
	} 
} 

interface BattingNBowling 
{ 
	public void batNBowl(); 
} 

class AllRounder implements BattingNBowling 
{ 
	public void batNBowl() 
	{ 
		System.out.println("I am Batting");
		System.out.println("I am Bowling\n"); 
	} 
} 

// You need to implement the interface your client expects to use. 
class adapter implements BattingNBowling 
{ 
	Batsman batsman; 
	public adapter(Batting batsman) 
	{ 
		this.batsman = (Batsman) batsman; 
	} 
	public void batNBowl() 
	{ 
		batsman.bat();
		System.out.println("added bowling capability\n"); 
	} 
} 

class Main 
{ 
	public static void main(String args[]) 
	{ 
		Batting kohli = new Batsman(); 
		BattingNBowling pandya = new AllRounder(); 

		// Wrap a batsman in a adapter so that it behaves like allrounder. 
		BattingNBowling kedar = new adapter(kohli); 

		System.out.println("Kohli..."); 
		kohli.bat();

		System.out.println("Pandya..."); 
		pandya.batNBowl(); 

		// toy duck behaving like a bird 
		System.out.println("kedar Adapter..."); 
		kedar.batNBowl();
	} 
} 

