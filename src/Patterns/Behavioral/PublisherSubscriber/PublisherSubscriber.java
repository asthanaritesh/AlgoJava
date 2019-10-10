/*This is incomplete code. Just for understanding */

package Patterns.Behavioral.PublisherSubscriber;

import java.util.Hashtable;
import java.util.List;

class Topic {
	public String topicName;
}

class Message {
	private String msg;
}

class Publisher {
	Topic topic;
	public Publisher(Topic t) {
		this.topic = t;
	}

	public void publish(Message m) {
		ContentServer.getInstance().sendMessage(this.topic, m);
	}
}


class ContentServer {
	private Hashtable<Topic, List<Subscriber>> subscriberLists;

	private static ContentServer serverInstance;

	public static ContentServer getInstance() {
		if (serverInstance == null) {
			serverInstance = new ContentServer();
		}
		return serverInstance;
	}

	private ContentServer() {
		this.subscriberLists = new Hashtable<>();
	}

	public void sendMessage(Topic t, Message m) {
		List<Subscriber> subs = subscriberLists.get(t);
		for (Subscriber s : subs) {
			s.receivedMessage(t, m);
		}
	}

	public void registerSubscriber(Subscriber s, Topic t) {
		subscriberLists.get(t).add(s);
	}


	public class Subscriber {
		public Subscriber(Topic...topics) {
			for (Topic t : topics) {
				ContentServer.getInstance().registerSubscriber(this, t);
			}
		}

		public void receivedMessage(Topic t, Message m) {
			switch(t.topicName) {
			}
		}
	}
}