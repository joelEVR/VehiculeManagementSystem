package Vehicle;
import Builder.VehicleDirector;
import Singleton.VehicleManager;

public class Client {
    public static void main(String[] args) {
    	
        VehicleManager manager = VehicleManager.getInstance();
        VehicleDirector director = new VehicleDirector();

        Vehicle sportsCar = director.buildSportsCar();
        manager.addVehicle(sportsCar);

        Vehicle standardMotorcycle = director.buildStandardMotorcycle();
        manager.addVehicle(standardMotorcycle);

        System.out.println("Vehículos añadidos: " + manager.getVehicles().size());
    }
}
