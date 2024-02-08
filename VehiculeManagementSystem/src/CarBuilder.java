
public class CarBuilder implements VehicleBuilder {

	private Car car;

	public CarBuilder() {
		this.car = new Car();
	}

	@Override
	public VehicleBuilder buildEngine(String engine) {
		car.setEngine(engine);
		return this;
	}

	@Override
	public VehicleBuilder buildWheels(int numberOfWheels) {
		car.setWheels(numberOfWheels);
		return this;
	}

	@Override
	public VehicleBuilder buildColor(String color) {
		car.setColor(color);
		return this;
	}

	public VehicleBuilder transmission(String transmission) {
		car.setTransmission(transmission);
		return this;
	}

	public VehicleBuilder numberOfDoors(int numberOfDoors) {
		car.setNumberOfDoors(numberOfDoors);
		return this;
	}

	public VehicleBuilder hasAirConditioning(boolean hasAirConditioning) {
		car.setHasAirConditioning(hasAirConditioning);
		return this;
	}

	@Override
	public Vehicle finish() {
		return car;
	}
}
