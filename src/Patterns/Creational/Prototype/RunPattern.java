package Patterns.Creational.Prototype;

public class RunPattern {
	public static void main(String[] args) throws CloneNotSupportedException {
		Car car1 = new Car(); //All heavy work of db queries happen here.
		Car car2 = car1.CreateClone("Toyota", 1500);
		car1.printDetails();
		car2.printDetails();
	}
}
