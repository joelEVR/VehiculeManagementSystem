package Vehicle;
public class Motorcycle implements Vehicle {

	private String engine;
	private int wheels;
	private String color;
	private String transmission;
	private String name;
	private String model;

	public Motorcycle() {
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public void start() {
		System.out.println("Motorcycle is starting");
	}

	@Override
	public void stop() {
		System.out.println("Motorcycle is stopping.");
	}

	@Override
	public String toString() {
		return "Motorcycle [engine=" + engine + ", wheels=" + wheels + ", color=" + color + ", transmission="
				+ transmission + ", name=" + name + ", model=" + model + "]";
	}

	
}
