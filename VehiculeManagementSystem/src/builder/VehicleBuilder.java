package builder;

import vehicle.Vehicle;

/**
 * Defines the contract for building vehicle objects. This interface is part of the Builder pattern,
 * facilitating the step-by-step construction of vehicles with customizable attributes.
 * Implementers of this interface will provide concrete methods to set various aspects of a vehicle,
 * such as its engine, wheels, color, name, model, and transmission, culminating in the construction
 * of a specific vehicle instance.
 */
public interface VehicleBuilder {

    /**
     * Sets the engine type of the vehicle.
     * @param engine A string representing the engine type.
     * @return The current instance of VehicleBuilder for chaining.
     */
    VehicleBuilder buildEngine(String engine);

    /**
     * Sets the number of wheels on the vehicle.
     * @param numberOfWheels The number of wheels.
     * @return The current instance of VehicleBuilder for chaining.
     */
    VehicleBuilder buildWheels(int numberOfWheels);

    /**
     * Sets the color of the vehicle.
     * @param color A string representing the color.
     * @return The current instance of VehicleBuilder for chaining.
     */
    VehicleBuilder buildColor(String color);

    /**
     * Sets the name of the vehicle.
     * @param name A string representing the name.
     * @return The current instance of VehicleBuilder for chaining.
     */
    VehicleBuilder buildName(String name);

    /**
     * Sets the model of the vehicle.
     * @param model A string representing the model.
     * @return The current instance of VehicleBuilder for chaining.
     */
    VehicleBuilder buildModel(String model);

    /**
     * Sets the transmission type of the vehicle.
     * @param transmission A string representing the transmission type.
     * @return The current instance of VehicleBuilder for chaining.
     */
    VehicleBuilder buildTransmission(String transmission);

    /**
     * Completes the construction of the vehicle and returns the final product.
     * @return The built vehicle object.
     */
    Vehicle build();
}
