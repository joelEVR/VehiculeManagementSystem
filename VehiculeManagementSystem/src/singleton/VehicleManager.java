package singleton;

import java.util.ArrayList;
import java.util.List;

import vehicle.Vehicle;

/**
 * Implements the Singleton pattern to manage all vehicles in the system.
 * Ensures that there is only one instance of the VehicleManager class.
 * This class provides thread-safe methods to add and retrieve vehicles.
 */
public class VehicleManager {
    /**
     * The single instance of VehicleManager.
     */
    private static volatile VehicleManager instance;

    /**
     * A list to hold vehicles.
     */
    private List<Vehicle> vehicles;

    /**
     * Private constructor to prevent instantiation from outside the class.
     */
    private VehicleManager() {
        vehicles = new ArrayList<>();
    }

    /**
     * Provides access to the singleton instance of VehicleManager, using double-checked locking to ensure thread safety.
     * 
     * @return The singleton instance of VehicleManager.
     */
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

    /**
     * Adds a vehicle to the vehicle list.
     * 
     * @param vehicle The vehicle to be added.
     */
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    /**
     * Retrieves the list of vehicles.
     * 
     * @return A list of vehicles.
     */
    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
