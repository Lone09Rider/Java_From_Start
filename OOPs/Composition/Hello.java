package OOPs.Composition;

public class Hello {

	public static void main(String[] args) {

		Laptop lappy = new Laptop();
		System.out.println(lappy);
		
//		To Call Method from Object(Laptop) of Object(Processor)
		
		System.out.println(lappy.getProcessor().getBrand());
		
	}

}
