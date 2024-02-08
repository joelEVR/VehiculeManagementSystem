import java.util.ArrayList;
import java.util.List;

public class VehicleManager {

	private static VehicleManager singleton;
	private List<Vehicle> vehicles;
	
	private VehicleManager() {
        vehicles = new ArrayList<>();
	}
	
	public static VehicleManager getSingleton() {
		
		if(singleton == null) {
			
			synchronized(VehicleManager.class) {
			
				if (singleton == null) {
					singleton = new VehicleManager();
				}
			}
			
		}
		return singleton;
	}
	
	public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
