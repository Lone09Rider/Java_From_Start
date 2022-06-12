package OOPs.Encapsulation;

public class Hello {

	public static void main(String[] args) {

		Person jhon = new Person();
		System.out.println(jhon);

//		jhon.age = -10; // Cannot do anymore because that is private and encapsulated
//		System.out.println(jhon);

		Person pooja = new Person("Pooja", 19, "FEMALE");
		System.out.println(pooja);
		
		Person milu = new Person("Milu", 21, "FEMALE");
		milu.setAge(-19);
		System.out.println(milu);
		
	}

}
