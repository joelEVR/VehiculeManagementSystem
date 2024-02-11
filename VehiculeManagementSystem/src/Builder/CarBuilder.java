package Builder;

import Vehicle.Car;
import Vehicle.Vehicle;

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

	@Override
	public VehicleBuilder buildName(String name) {
		car.setName(name);
		return this;
	}

	@Override
	public VehicleBuilder buildModel(String model) {
		car.setModel(model);
		return this;
	}

	@Override
	public VehicleBuilder buildTransmission(String transmission) {
		car.setTransmission(transmission);
		return this;
	}

	@Override
	public Vehicle build() {
		return car;
	}
}
