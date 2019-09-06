package MultiThread;
class MyThread extends Thread 
{ 
	public void run() 
	{ 
		try
		{ 
			System.out.println ("Thread " + Thread.currentThread().getId() + " is running");
		} 
		catch (Exception e) 
		{ 
			System.out.println ("Exception is caught"); 
		} 
	} 
} 

public class MyThreadDemo 
{ 
	public static void main(String[] args) 
	{ 
		int n = 8; // Number of threads 
		for (int i=0; i<8; i++) 
		{ 
			MyThread object = new MyThread(); 
			object.start(); 
		} 
	} 
} 
