package builder;

import vehicle.Car;
import vehicle.Vehicle;

/**
 * Concrete builder for creating instances of Car.
 * Implements the VehicleBuilder interface to provide a fluent interface for car construction.
 */
public class CarBuilder implements VehicleBuilder {
    private Car car;

    /**
     * Constructor initializes a new Car object.
     */
    public CarBuilder() {
        this.car = new Car();
    }

    // Builder methods for setting car attributes, each returns the builder instance for chaining.

    /**
     * Sets the engine type of the car.
     */
    @Override
    public VehicleBuilder buildEngine(String engine) {
        car.setEngine(engine);
        return this;
    }

    /**
     * Sets the number of wheels on the car.
     */
    @Override
    public VehicleBuilder buildWheels(int numberOfWheels) {
        car.setWheels(numberOfWheels);
        return this;
    }

    /**
     * Sets the color of the car.
     */
    @Override
    public VehicleBuilder buildColor(String color) {
        car.setColor(color);
        return this;
    }

    /**
     * Sets the name of the car.
     */
    @Override
    public VehicleBuilder buildName(String name) {
        car.setName(name);
        return this;
    }

    /**
     * Sets the model of the car.
     */
    @Override
    public VehicleBuilder buildModel(String model) {
        car.setModel(model);
        return this;
    }

    /**
     * Sets the transmission type of the car.
     */
    @Override
    public VehicleBuilder buildTransmission(String transmission) {
        car.setTransmission(transmission);
        return this;
    }

    /**
     * Finalizes the construction of the car and returns it.
     * @return The constructed Car object.
     */
    @Override
    public Vehicle build() {
        return car;
    }
}
