package Patterns.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public interface Subject {
	public void register(Observer obj);
	public void unregister(Observer obj);
	public void notifyObservers();	
}

class Model implements Subject {
	int value;
	List<Observer> obsList;
	public Model(int val) {
		value = val;
		obsList = new ArrayList<Observer>();
	}
	public void register(Observer obs) {
		if (!obsList.contains(obs)) obsList.add(obs);
	}
	public void unregister(Observer obj) {
		obsList.remove(obj);		
	}
	public void notifyObservers() {
		for(Observer obs : obsList) {
			obs.getNotified(value);
		}
	}
	public void changeValue(int newVal) {
		value = newVal;
		notifyObservers();
	}
}

