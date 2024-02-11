package Builder;
import Vehicle.Car;
import Vehicle.Vehicle;

public class CarBuilder implements VehicleBuilder {

	private Car car;

	public CarBuilder() {
		this.car = new Car();
	}

	@Override
	public void buildEngine(String engine) {
		car.setEngine(engine);
	}

	@Override
	public void buildWheels(int numberOfWheels) {
		car.setWheels(numberOfWheels);
	}

	@Override
	public void buildColor(String color) {
		car.setColor(color);
	}

	public void buildTransmission(String transmission) {
		car.setTransmission(transmission);
	}

	@Override
	public void buildName(String name) {
		car.setName(name);
	}

	@Override
	public void buildModel(String model) {
		car.setModel(model);
	}
	
	@Override
	public Vehicle build() {
		return car;
	}
}
