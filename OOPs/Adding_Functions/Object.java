package OOPs.Adding_Functions;

public class Object {
	public static void main(String[] args) {
		
		Car car  = new Car();
		car.setSpeed(120);
		System.out.println(car.getSpeed());
		
		car.setDoors("closed");
		System.out.println(car.getDoors());
		
		car.setDriver("sitting");
		System.out.println(car.getDriver());
		
		car.setEngine("on");
		System.out.println(car.getEngine());
		
		System.out.println(car.run());
	}
}
