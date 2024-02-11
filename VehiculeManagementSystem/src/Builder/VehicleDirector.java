package Builder;
import Vehicle.Vehicle;

public class VehicleDirector {

    public Vehicle buildSportsCar() {
        CarBuilder builder = new CarBuilder();
        return builder.buildEngine("V8")
                      .buildWheels(4)
                      .buildColor("Red")
                      .buildTransmission("Manual")
                      .buildName("Dodge")
                      .buildModel("2005");
    }

    public Vehicle buildStandardMotorcycle() {
        MotorcycleBuilder builder = new MotorcycleBuilder();
        return builder.buildEngine("250cc")
                      .buildWheels(2)
                      .buildColor("Black")
                      .build();
    }
}
