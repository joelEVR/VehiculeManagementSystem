import static org.junit.Assert.*;
import org.junit.Test;

import singleton.VehicleManager;
import vehicle.Car;

public class VehicleManagerTest {

    @Test
    public void testSingletonInstance() {
        VehicleManager firstInstance = VehicleManager.getInstance();
        VehicleManager secondInstance = VehicleManager.getInstance();
        assertSame("Singleton instances are not the same", firstInstance, secondInstance);
    }

    @Test
    public void testAddAndRetrieveVehicles() {
        VehicleManager manager = VehicleManager.getInstance();
        manager.addVehicle(new Car("TestCar", "ModelX", "Red", "V6", 4, "Automatic"));
        assertEquals("Vehicle list size mismatch", 1, manager.getVehicles().size());
    }
}
