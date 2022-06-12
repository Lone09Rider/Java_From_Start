package OOPs.Encapsulation;

public class Person {

	private String name = "Jhon";
	private int age = 25;
	private String gender = "Male";

	public Person() {
		this.name = "Jhon";
		this.age = 25;
		this.gender = "Male";
	}

	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean setAge(int age) {
		if (age >= 1 && age <= 100)
			this.age = age;
		return true;
	}

	public String getGender() {
		return gender;
	}

}
