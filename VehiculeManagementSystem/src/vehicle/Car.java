package vehicle;

/**
 * Represents a car with specific attributes and behaviors. Implements the
 * Vehicle interface to provide basic vehicle operations.
 */
public class Car implements Vehicle {

	private String engine;
	private int wheels;
	private String color;
	private String transmission;
	private String name;
	private String model;

	/**
	 * Default constructor.
	 */
	public Car() {
	}

	/**
	 * Parameterized constructor to initialize a car object with specific
	 * attributes.
	 *
	 * @param name           The name of the car.
	 * @param model          The model year of the car.
	 * @param color          The color of the car.
	 * @param engine         The engine type of the car.
	 * @param numberOfWheels The number of wheels on the car.
	 * @param transmission   The transmission type of the car.
	 */
	public Car(String name, String model, String color, String engine, int numberOfWheels, String transmission) {
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
	 * Starts the car, displaying a message.
	 */
	@Override
	public void start() {
		System.out.println("Car is starting");
	}

	/**
	 * Stops the car, displaying a message.
	 */
	@Override
	public void stop() {
		System.out.println("Car is stopping.");
	}

	/**
	 * Returns a string representation of the car's attributes.
	 *
	 * @return A string detailing the car's specifications.
	 */
	@Override
	public String toString() {
		return "Car [engine=" + engine + ", wheels=" + wheels + ", color=" + color + ", transmission=" + transmission
				+ ", name=" + name + ", model=" + model + "]";
	}
}
