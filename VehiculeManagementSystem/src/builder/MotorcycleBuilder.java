package builder;

import vehicle.Motorcycle;
import vehicle.Vehicle;

/**
 * Concrete builder for creating Motorcycle instances.
 * Implements the VehicleBuilder interface for step-by-step construction of a motorcycle.
 */
public class MotorcycleBuilder implements VehicleBuilder {
    private Motorcycle motorcycle;

    /**
     * Initializes a new Motorcycle object.
     */
    public MotorcycleBuilder() {
        this.motorcycle = new Motorcycle();
    }

    // Builder methods for motorcycle attributes, enabling chaining.

    /**
     * Sets the engine type of the motorcycle.
     */
    @Override
    public VehicleBuilder buildEngine(String engine) {
        motorcycle.setEngine(engine);
        return this;
    }

    /**
     * Sets the number of wheels.
     */
    @Override
    public VehicleBuilder buildWheels(int numberOfWheels) {
        motorcycle.setWheels(numberOfWheels);
        return this;
    }

    /**
     * Sets the color.
     */
    @Override
    public VehicleBuilder buildColor(String color) {
        motorcycle.setColor(color);
        return this;
    }

    /**
     * Sets the name.
     */
    @Override
    public VehicleBuilder buildName(String name) {
        motorcycle.setName(name);
        return this;
    }

    /**
     * Sets the model.
     */
    @Override
    public VehicleBuilder buildModel(String model) {
        motorcycle.setModel(model);
        return this;
    }

    /**
     * Sets the transmission type.
     */
    @Override
    public VehicleBuilder buildTransmission(String transmission) {
        motorcycle.setTransmission(transmission);
        return this;
    }

    /**
     * Completes the construction and returns the Motorcycle object.
     * @return The constructed Motorcycle.
     */
    @Override
    public Vehicle build() {
        return motorcycle;
    }
}
