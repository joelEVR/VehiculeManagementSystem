package singleton;
import static org.junit.Assert.*;
import org.junit.Test;
import vehicle.Car;

/**
 * Tests for the {@link VehicleManager} class to ensure it correctly implements singleton behavior
 * and vehicle management functionalities.
 */
public class VehicleManagerTest {

    /**
     * Verifies that the VehicleManager class adheres to the singleton pattern by returning the
     * same instance upon multiple invocations.
     */
    @Test
    public void testSingletonInstance() {
        VehicleManager firstInstance = VehicleManager.getInstance();
        VehicleManager secondInstance = VehicleManager.getInstance();
        assertSame("Singleton instances are not the same", firstInstance, secondInstance);
    }

    /**
     * Tests the ability of VehicleManager to add a vehicle to its management list and
     * correctly retrieve the list of vehicles, ensuring the list size is accurate.
     */
    @Test
    public void testAddAndRetrieveVehicles() {
        VehicleManager manager = VehicleManager.getInstance();
        manager.addVehicle(new Car("TestCar", "ModelX", "Red", "V6", 4, "Automatic"));
        assertEquals("Vehicle list size mismatch", 1, manager.getVehicles().size());
    }
}
