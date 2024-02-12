package builder;

import vehicle.Vehicle;

/**
 * Directs the construction process of a vehicle.
 * Utilizes a VehicleBuilder to create a vehicle step-by-step.
 */
public class VehicleDirector {
    private VehicleBuilder vehicleBuilder;

    /**
     * Default constructor.
     */
    public VehicleDirector() {
        // The builder is not initialized here, allowing dynamic assignment.
    }

    /**
     * Sets the builder that will be used for vehicle construction.
     * @param builder The VehicleBuilder to use for constructing a vehicle.
     */
    public void setBuilder(VehicleBuilder builder) {
        this.vehicleBuilder = builder;
    }

    /**
     * Constructs a vehicle using the current builder.
     * @return The constructed vehicle.
     * @throws IllegalStateException if a builder has not been set.
     */
    public Vehicle buildVehicle() {
        if (vehicleBuilder == null) {
            throw new IllegalStateException("VehicleBuilder not set. Please set a builder before building a vehicle.");
        }
        return vehicleBuilder.build();
    }
}
