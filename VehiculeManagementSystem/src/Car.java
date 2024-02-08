
public class Car implements Vehicle {

	private String engine;
	private int wheels;
	private String color;
	private String transmission;
	private int numberOfDoors;
	private boolean hasAirConditioning;

	public Car() {
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

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public void setHasAirConditioning(boolean hasAirConditioning) {
		this.hasAirConditioning = hasAirConditioning;
	}

	@Override
	public void start() {
		System.out.println("Car with engine " + engine + ", " + wheels + " wheels, " + color + " color, " + transmission
				+ " transmission, " + numberOfDoors + " doors, and " + (hasAirConditioning ? "with" : "without")
				+ " air conditioning is starting.");
	}

	@Override
	public void stop() {
		System.out.println("Car is stopping.");
	}
}
