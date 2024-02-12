import org.junit.Test;
import static org.junit.Assert.*;
import builder.CarBuilder;
import builder.MotorcycleBuilder;
import builder.VehicleBuilder;
import factory.VehicleFactory;

public class VehicleFactoryTest {

    @Test
    public void testGetCarBuilder() {
        VehicleBuilder builder = VehicleFactory.getVehicleBuilder("car");
        assertNotNull("CarBuilder should not be null", builder);
        assertTrue("Builder should be instance of CarBuilder", builder instanceof CarBuilder);
    }

    @Test
    public void testGetMotorcycleBuilder() {
        VehicleBuilder builder = VehicleFactory.getVehicleBuilder("motorcycle");
        assertNotNull("MotorcycleBuilder should not be null", builder);
        assertTrue("Builder should be instance of MotorcycleBuilder", builder instanceof MotorcycleBuilder);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetVehicleBuilderWithUnknownType() {
        VehicleFactory.getVehicleBuilder("unknown");
    }
}
