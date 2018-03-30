package Patterns.Behavioral.Visitor;

public interface Host {
	public void accept (Visitor guest);
	public String getNativelanguage();
}

class HindiHost implements Host {
	String Nativelanguage;
	public HindiHost() {
		Nativelanguage = "Hindi";
	}
	public void accept (Visitor guest) {
		guest.visit(this);
	}
	public String getNativelanguage() {
		return Nativelanguage;
	}
}

class EnglishHost implements Host {
	String Nativelanguage;
	public EnglishHost() {
		Nativelanguage = "English";
	}
	public void accept (Visitor guest) {
		guest.visit(this);
	}
	public String getNativelanguage() {
		return Nativelanguage;
	}
}

class BengaliHost implements Host {
	String Nativelanguage;
	public BengaliHost() {
		Nativelanguage = "Bengali";
	}
	public void accept (Visitor guest) {
		guest.visit(this);
	}
	public String getNativelanguage() {
		return Nativelanguage;
	}
}