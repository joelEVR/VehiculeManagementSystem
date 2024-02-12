package vehicle;

/**
 * Represents a motorcycle with specific attributes and behaviors. Implements
 * the Vehicle interface to provide basic vehicle operations tailored to
 * motorcycles.
 */
public class Motorcycle implements Vehicle {

	// Attributes specific to motorcycles
	private String engine;
	private int wheels;
	private String color;
	private String transmission;
	private String name;
	private String model;

	/**
	 * Default constructor for Motorcycle class.
	 */
	public Motorcycle() {
	}

	/**
	 * Parameterized constructor to initialize a motorcycle with detailed
	 * attributes.
	 *
	 * @param name           The name of the motorcycle.
	 * @param model          The model of the motorcycle.
	 * @param color          The color of the motorcycle.
	 * @param engine         The engine type of the motorcycle.
	 * @param numberOfWheels The number of wheels on the motorcycle.
	 * @param transmission   The transmission type of the motorcycle.
	 */
	public Motorcycle(String name, String model, String color, String engine, int numberOfWheels, String transmission) {
		this.name = name;
		this.model = model;
		this.color = color;
		this.engine = engine;
		this.wheels = numberOfWheels;
		this.transmission = transmission;
	}

	// Setter methods for each attribute
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

	/**
	 * Starts the motorcycle, displaying a starting message.
	 */
	@Override
	public void start() {
		System.out.println("Motorcycle is starting");
	}

	/**
	 * Stops the motorcycle, displaying a stopping message.
	 */
	@Override
	public void stop() {
		System.out.println("Motorcycle is stopping.");
	}

	/**
	 * Returns a string representation of the motorcycle's attributes.
	 *
	 * @return A string detailing the motorcycle's specifications.
	 */
	@Override
	public String toString() {
		return "Motorcycle [engine=" + engine + ", wheels=" + wheels + ", color=" + color + ", transmission="
				+ transmission + ", name=" + name + ", model=" + model + "]";
	}
}
