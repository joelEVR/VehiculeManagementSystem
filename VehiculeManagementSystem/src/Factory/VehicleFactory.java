package Factory;

import Builder.CarBuilder;
import Builder.VehicleBuilder; // Asegúrate de tener esta interfaz definida correctamente

public class VehicleFactory {

	public static VehicleBuilder getVehicleBuilder(String type) {
		switch (type) {
		case "car":
			return new CarBuilder();
		// case "motorcycle":
		// return new MotorcycleBuilder();
		default:
			throw new IllegalArgumentException("Unknown vehicle type");
		}
	}
}
