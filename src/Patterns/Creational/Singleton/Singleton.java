package Patterns.Creational.Singleton;

public class Singleton {
	private static Singleton instance;
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}

class ThreadsafeSingleton {
	private static ThreadsafeSingleton instance;
	public static synchronized ThreadsafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadsafeSingleton();
		}
		return instance;
	}
}


//To overcome the situation where singleton can be failed using Reflection (see PlayPattern.java)
// Enum can be used this way to implement Singleton design pattern. (play usecase not available)
enum EnumSingleton {
    INSTANCE;    
    public static void doSomething(){
        //do something
    }
}

