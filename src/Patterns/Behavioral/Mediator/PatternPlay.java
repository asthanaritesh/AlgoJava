package Patterns.Behavioral.Mediator;

public class PatternPlay {
	public static void main(String[] args) {
		Mediator med = new ChatMediator();
		User user1 = new UserImpl(med, "Suresh");
		User user2 = new UserImpl(med, "Ramesh");
		User user3 = new UserImpl(med, "Mahesh");
		user1.sendMessage("Hello Everyone from "+ user1.getName(), user1);
		user2.sendMessage("Hello Everyone from "+ user2.getName(), user2);
		user3.sendMessage("Hello Everyone from "+ user3.getName(), user3);
	}
}
