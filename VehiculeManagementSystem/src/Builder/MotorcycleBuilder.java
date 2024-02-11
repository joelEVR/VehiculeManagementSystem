package Builder;
import Vehicle.Motorcycle;
import Vehicle.Vehicle;

public class MotorcycleBuilder implements VehicleBuilder {

	private Motorcycle motorcycle;

	public MotorcycleBuilder() {
		this.motorcycle = new Motorcycle();
	}

	@Override
	public void buildEngine(String engine) {
		motorcycle.setEngine(engine);
	}

	@Override
	public void buildWheels(int numberOfWheels) {
		motorcycle.setWheels(numberOfWheels);
	}

	@Override
	public void buildColor(String color) {
		motorcycle.setColor(color);
	}

	@Override
	public void buildName(String name) {
		motorcycle.setName(name);
	}

	@Override
	public void buildModel(String model) {
		motorcycle.setModel(model);
	}

	@Override
	public void buildTransmission(String transmission) {
		motorcycle.setTransmission(transmission);
	}

	@Override
	public Vehicle build() {
		return motorcycle;
	}
}
