package OOPs.Composition;

public class Laptop {
	private float screen;
	private Processor processor;
	private String ram;
	private GraphicsCard graphics;
	private String opticalDrive;
	private String keyboard;

	public Laptop() {
		this.screen = 15.6f;
		this.processor = new Processor();
		this.ram = "DDR4";
		this.graphics = new GraphicsCard();
		this.opticalDrive = "Multi-Layered";
		this.keyboard = "backlit";
	}

	public Laptop(float screen, Processor processor, String ram, GraphicsCard graphics, String opticalDrive,
			String keyboard) {
		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
		this.graphics = graphics;
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
	}

	@Override
	public String toString() {
		return "Laptop [screen=" + screen + ", processor=" + processor + ", ram=" + ram + ", graphics=" + graphics
				+ ", opticalDrive=" + opticalDrive + ", keyboard=" + keyboard + "]";
	}

	public Processor getProcessor() {
		return processor;
	}

}
