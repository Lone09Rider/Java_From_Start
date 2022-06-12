package OOPs.Constructors;

public class Object {
	public static void main(String[] args) {
		
		Car car  = new Car("closed", "on", "sitting", 120);
		System.out.println(car.run());
		
		Car car2  = new Car("closed", "on", "sitting", 0);
		System.out.println(car2.run());
	}
}
