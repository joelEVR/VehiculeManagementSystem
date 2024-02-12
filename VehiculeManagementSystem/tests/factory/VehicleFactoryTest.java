package factory;
import org.junit.Test;
import static org.junit.Assert.*;
import builder.CarBuilder;
import builder.MotorcycleBuilder;
import builder.VehicleBuilder;

/**
 * Tests the functionality of the {@link VehicleFactory} class to ensure it correctly
 * creates instances of {@link VehicleBuilder} based on the specified vehicle type.
 */
public class VehicleFactoryTest {

    /**
     * Verifies that the VehicleFactory returns a non-null CarBuilder instance
     * when "car" is passed as an argument. It also checks that the returned builder
     * is indeed an instance of CarBuilder.
     */
    @Test
    public void testGetCarBuilder() {
        VehicleBuilder builder = VehicleFactory.getVehicleBuilder("car");
        assertNotNull("CarBuilder should not be null", builder);
        assertTrue("Builder should be instance of CarBuilder", builder instanceof CarBuilder);
    }

    /**
     * Tests that the VehicleFactory can successfully return a non-null MotorcycleBuilder instance
     * when "motorcycle" is requested. Ensures that the returned builder is of the correct type.
     */
    @Test
    public void testGetMotorcycleBuilder() {
        VehicleBuilder builder = VehicleFactory.getVehicleBuilder("motorcycle");
        assertNotNull("MotorcycleBuilder should not be null", builder);
        assertTrue("Builder should be instance of MotorcycleBuilder", builder instanceof MotorcycleBuilder);
    }

    /**
     * Ensures that the VehicleFactory throws an IllegalArgumentException when asked to
     * create a builder for an unknown vehicle type, demonstrating error handling for invalid inputs.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testGetVehicleBuilderWithUnknownType() {
        VehicleFactory.getVehicleBuilder("unknown");
    }
}
