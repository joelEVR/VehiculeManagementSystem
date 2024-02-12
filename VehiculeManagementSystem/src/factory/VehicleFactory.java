package factory;

import builder.CarBuilder;
import builder.MotorcycleBuilder;
import builder.VehicleBuilder;

/**
 * Factory class for creating instances of VehicleBuilder.
 * Utilizes the Simple Factory pattern to return specific builder instances based on vehicle type.
 */
public class VehicleFactory {

    /**
     * Static method to get a VehicleBuilder instance based on the vehicle type.
     * 
     * @param type The type of vehicle for which a builder is requested ("car" or "motorcycle").
     * @return VehicleBuilder instance corresponding to the requested vehicle type.
     * @throws IllegalArgumentException if the vehicle type is unknown.
     */
    public static VehicleBuilder getVehicleBuilder(String type) {
        switch (type) {
            case "car":
                return new CarBuilder();
            case "motorcycle":
                return new MotorcycleBuilder();
            default:
                throw new IllegalArgumentException("Unknown vehicle type");
        }
    }
}
