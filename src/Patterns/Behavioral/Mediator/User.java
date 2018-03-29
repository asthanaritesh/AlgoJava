package Patterns.Behavioral.Mediator;

public abstract class User {
	public String name;
	public Mediator chatMediator; 
	public abstract void sendMessage(String msg, User usr);
	public abstract void receiveMessage(String msg);
	public String getName() {return name;}
}

class UserImpl extends User {

	UserImpl(Mediator med, String usrName) {
		if(chatMediator == null)
			chatMediator = med;
		chatMediator.addUser(this);
		name = usrName;
	}
	@Override
	public void sendMessage(String msg, User usr) {
		System.out.println(name + ": Msg Sent: "+ msg);
		chatMediator.sendMessage(msg, this);		
	}
	@Override
	public void receiveMessage(String msg) {
		System.out.println(name + ": Msg Recieved: "+ msg);		
	}	

}