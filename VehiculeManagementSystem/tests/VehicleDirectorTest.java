import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import builder.CarBuilder;
import builder.VehicleBuilder;
import builder.VehicleDirector;
import vehicle.Car;
import vehicle.Vehicle;

public class VehicleDirectorTest {

    private VehicleDirector director;
    private VehicleBuilder carBuilder;

    @Before
    public void setUp() {
        director = new VehicleDirector();
        carBuilder = new CarBuilder()
                .buildEngine("V6")
                .buildWheels(4)
                .buildColor("Blue")
                .buildName("Fusion")
                .buildModel("Ford")
                .buildTransmission("Automatic");
    }

    @Test
    public void testBuildVehicleWithBuilder() {
        director.setBuilder(carBuilder);
        Vehicle vehicle = director.buildVehicle();
        assertNotNull("Vehicle should not be null", vehicle);
        assertTrue("Vehicle should be instance of Car", vehicle instanceof Car);
    }

    @Test(expected = IllegalStateException.class)
    public void testBuildVehicleWithoutBuilder() {
        director.buildVehicle();
    }
}
