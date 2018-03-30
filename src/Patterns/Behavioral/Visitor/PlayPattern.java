package Patterns.Behavioral.Visitor;

public class PlayPattern {
	public static void main(String[] args) {
		Host host1 = new HindiHost();
		Host host2 = new EnglishHost();
		Host host3 = new BengaliHost();
		Visitor visitor1 = new HindiVisitor();
		Visitor visitor2 = new EnglishVisitor();
		Visitor visitor3 = new BengaliVisitor();
		host1.accept(visitor1);
		System.out.println("=================");
		host1.accept(visitor2);
		System.out.println("=================");
		host1.accept(visitor3);
		System.out.println("=================");
		host2.accept(visitor1);
		System.out.println("=================");
		host2.accept(visitor2);
		System.out.println("=================");
		host3.accept(visitor2);
		System.out.println("=================");
		host3.accept(visitor3);
	}
}
