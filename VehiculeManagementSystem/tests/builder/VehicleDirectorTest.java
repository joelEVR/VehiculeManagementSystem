package builder;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import vehicle.Car;
import vehicle.Vehicle;

/**
 * Test class for {@link VehicleDirector} to verify the director's ability to
 * use different builders to construct vehicle objects correctly.
 */
public class VehicleDirectorTest {

    private VehicleDirector director;
    private VehicleBuilder carBuilder;

    /**
     * Sets up the test environment before each test method.
     * Initializes the VehicleDirector and CarBuilder with predefined attributes.
     */
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

    /**
     * Tests that the VehicleDirector correctly constructs a vehicle using the set builder.
     * Verifies the non-nullness of the constructed vehicle and that it is an instance of Car.
     */
    @Test
    public void testBuildVehicleWithBuilder() {
        director.setBuilder(carBuilder);
        Vehicle vehicle = director.buildVehicle();
        assertNotNull("Vehicle should not be null", vehicle);
        assertTrue("Vehicle should be instance of Car", vehicle instanceof Car);
    }

    /**
     * Tests that the VehicleDirector throws an IllegalStateException when attempting to
     * build a vehicle without first setting a builder.
     */
    @Test(expected = IllegalStateException.class)
    public void testBuildVehicleWithoutBuilder() {
        director.buildVehicle();
    }
}
