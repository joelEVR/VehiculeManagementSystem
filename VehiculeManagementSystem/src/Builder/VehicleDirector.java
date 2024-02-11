package Builder;

import Vehicle.Vehicle;

public class VehicleDirector {
	private VehicleBuilder vehicleBuilder;

	public VehicleDirector(VehicleBuilder builder) {
		this.vehicleBuilder = builder;
	}

	public Vehicle buildVehicle() {
		// El director simplemente inicia el proceso de construcción
		// La configuración específica del vehículo se hace antes de este paso
		return vehicleBuilder.build();
	}
}
