package OOPs.Classes_Intro;

public class Object {
	public static void main(String[] args) {
		
		Car car  = new Car();
		car.setSpeed(120);
		System.out.println(car.getSpeed());
		
		car.setDoors("Closed");
		System.out.println(car.getDoors());
		
	}
}
