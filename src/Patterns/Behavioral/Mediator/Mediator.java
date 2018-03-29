package Patterns.Behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

public interface Mediator {
	public void sendMessage(String msg, User usr);
	void addUser(User usr);
}

// actually should be singleton class.
class ChatMediator implements Mediator {
	List<User> usrGrp;
	public ChatMediator(){
		if (usrGrp == null)
			usrGrp = new ArrayList<User>();
	}
	@Override
	public void sendMessage(String msg, User user) {
		for(User usr : usrGrp) {
			if(usr != user)
				usr.receiveMessage(msg);
		}		
	}
	@Override
	public void addUser(User usr) {
		if (!usrGrp.contains(usr))		
			usrGrp.add(usr);
	}	
}