package Patterns.Behavioral.Visitor;

public interface Visitor {
	public void visit(Host host);
}
// Visitor has the algorithm to communicate with the host. Host has no control on choosing language for communication.
class HindiVisitor implements Visitor {
	public void visit(Host host) {
		if (host.getNativelanguage() == "Hindi")
			System.out.println("Hindi Visitor: I will talk to Hindi Host in Hindi");
		if (host.getNativelanguage() == "English")
			System.out.println("Hindi Visitor: I will talk to English Host in English");
		if (host.getNativelanguage() == "Bengali")
			System.out.println("Hindi Visitor: I will talk to Bengali Host in Hindi");
	}
}

class EnglishVisitor implements Visitor {
	public void visit(Host host) {
		if (host.getNativelanguage() == "Hindi")
			System.out.println("EnglishVisitor Visitor: I will talk to Hindi Host in Hindi");
		if (host.getNativelanguage() == "English")
			System.out.println("EnglishVisitor Visitor: I will talk to English Host in English");
		if (host.getNativelanguage() == "Bengali")
			System.out.println("EnglishVisitor Visitor: I will talk to Bengali Host in English");
	}
}

class BengaliVisitor implements Visitor {
	public void visit(Host host) {
		if (host.getNativelanguage() == "Hindi")
			System.out.println("BengaliVisitor Visitor: I will talk to Hindi Host in Bengali");
		if (host.getNativelanguage() == "English")
			System.out.println("BengaliVisitor Visitor: I will talk to English Host in Hindi");
		if (host.getNativelanguage() == "Bengali")
			System.out.println("BengaliVisitor Visitor: I will talk to Bengali Host in Bengali");
	}
}