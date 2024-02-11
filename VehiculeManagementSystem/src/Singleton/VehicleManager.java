package Singleton;
import java.util.ArrayList;
import java.util.List;

import Vehicle.Vehicle;

public class VehicleManager {

	private static VehicleManager instance;
	private List<Vehicle> vehicles;

	private VehicleManager() {
		vehicles = new ArrayList<>();
	}

	public static VehicleManager getInstance() {

		if (instance == null) {

			synchronized (VehicleManager.class) {

				if (instance == null) {
					instance = new VehicleManager();
				}
			}

		}
		return instance;
	}

	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}
}
