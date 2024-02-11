package Builder;

import Vehicle.Vehicle;

public interface VehicleBuilder {

	VehicleBuilder buildEngine(String engine);

	VehicleBuilder buildWheels(int numberOfWheels);

	VehicleBuilder buildColor(String color);

	VehicleBuilder buildName(String name);

	VehicleBuilder buildModel(String model);

	VehicleBuilder buildTransmission(String transmission);

	Vehicle build(); // Método para finalizar la construcción y devolver el objeto Vehicle construido
}
