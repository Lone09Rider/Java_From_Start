package OOPs.Constructors.Default;

public class Object {
	public static void main(String[] args) {
		
//		Car car  = new Car("closed", "on", "sitting", 120);
//		System.out.println(car.run());
		
		Car car  = new Car();
		car.setDoors("closed");
		car.setDriver("sitting");
		car.setEngine("on");
		car.setSpeed(0);
		System.out.println(car.run());
	}
}
