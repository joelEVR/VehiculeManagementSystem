
public class MotorcycleBuilder implements VehicleBuilder {

	private Motorcycle motorcycle;

	public MotorcycleBuilder() {
		this.motorcycle = new Motorcycle();
	}

	@Override
	public MotorcycleBuilder buildEngine(String engine) {
		motorcycle.setEngine(engine);
		return this;
	}

	@Override
	public MotorcycleBuilder buildWheels(int numberOfWheels) {
		motorcycle.setWheels(numberOfWheels);
		return this;
	}

	@Override
	public MotorcycleBuilder buildColor(String color) {
		motorcycle.setColor(color);
		return this;
	}

	public MotorcycleBuilder buildHandlebarType(String handlebarType) {
		motorcycle.setHandlebarType(handlebarType);
		return this;
	}

	@Override
	public Vehicle finish() {
		return motorcycle;
	}
}
