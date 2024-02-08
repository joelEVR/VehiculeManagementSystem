
public interface VehicleBuilder {

	VehicleBuilder buildEngine(String engine);

	VehicleBuilder buildWheels(int numberOfWheels);

	VehicleBuilder buildColor(String color);

	Vehicle finish();

}
