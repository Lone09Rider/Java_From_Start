package OOPs.PolyMorphism;

public class Helllo {
	public static void main(String[] args) {
		
		Phone phone = new Phone("Nokia 1200");
		System.out.println(phone.getModel());
		phone.features();
		
		SamsungNote8 s = new SamsungNote8("Note 8");
		System.out.println(s.getModel());
		s.features();
		
//		Polymorphism
		Phone note8 = new SamsungNote8("Note 8.5");
		System.out.println(note8.getModel());
		note8.features();
		
	}
}
