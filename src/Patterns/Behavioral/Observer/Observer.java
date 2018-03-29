package Patterns.Behavioral.Observer;

public interface Observer {
	public void getNotified(int val);	
	public void listenTo(Subject sub);
	public void stopListening(Subject sub);
}

class View2D implements Observer {
	String myName;
	public View2D(String name) {
		myName = name;
	}
	public void getNotified(int val) {
		System.out.println(myName + ": Value Changed to "+ val);		
	}
	public void listenTo(Subject sub) {
		sub.register(this);		
	}
	public void stopListening(Subject sub) {
		sub.unregister(this);		
	}	
}

class View3D implements Observer {
	String myName;
	public View3D(String name) {
		myName = name;
	}
	public void getNotified(int val) {
		System.out.println(myName + ": Value Changed to "+ val);	
	}
	public void listenTo(Subject sub) {
		sub.register(this);		
	}
	public void stopListening(Subject sub) {
		sub.unregister(this);		
	}	
}

class ViewWireFrame implements Observer {
	String myName;
	public ViewWireFrame(String name) {
		myName = name;
	}
	public void getNotified(int val) {
		System.out.println(myName + ": Value Changed to "+ val);		
	}
	public void listenTo(Subject sub) {
		sub.register(this);		
	}
	public void stopListening(Subject sub) {
		sub.unregister(this);		
	}	
}