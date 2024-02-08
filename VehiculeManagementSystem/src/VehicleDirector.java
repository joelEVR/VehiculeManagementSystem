
public class VehicleDirector {

	private VehicleBuilder builder;

	public VehicleDirector(VehicleBuilder builder) {
		this.builder = builder;
	}

	public Vehicle buildCar() {
		return builder.buildEngine("1600cc").buildWheels(4).buildColor("Red").finish();
	}

	public Vehicle buildMotorcycle() {
		return builder.buildEngine("500cc").buildWheels(2).buildColor("Black").finish();
	}
}
