package Builder;

import Vehicle.Motorcycle;
import Vehicle.Vehicle;

public class MotorcycleBuilder implements VehicleBuilder {

	private Motorcycle motorcycle;

	public MotorcycleBuilder() {
		this.motorcycle = new Motorcycle();
	}

	@Override
	public VehicleBuilder buildEngine(String engine) {
		motorcycle.setEngine(engine);
		return this;
	}

	@Override
	public VehicleBuilder buildWheels(int numberOfWheels) {
		motorcycle.setWheels(numberOfWheels);
		return this;
	}

	@Override
	public VehicleBuilder buildColor(String color) {
		motorcycle.setColor(color);
		return this;
	}

	@Override
	public VehicleBuilder buildName(String name) {
		motorcycle.setName(name);
		return this;
	}

	@Override
	public VehicleBuilder buildModel(String model) {
		motorcycle.setModel(model);
		return this;
	}

	@Override
	public VehicleBuilder buildTransmission(String transmission) {
		motorcycle.setTransmission(transmission);
		return this;
	}

	@Override
	public Vehicle build() {
		return motorcycle;
	}
}
