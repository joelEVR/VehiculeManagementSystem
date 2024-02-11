package Main;

import Factory.VehicleFactory;
import Singleton.VehicleManager;

import java.util.List;

import Builder.VehicleBuilder;
import Builder.VehicleDirector;
import Vehicle.Vehicle;

public class Main {
	public static void main(String[] args) {
		VehicleBuilder builder = VehicleFactory.getVehicleBuilder("car").buildEngine("V6").buildWheels(4)
				.buildColor("Blue").buildName("Sedan").buildModel("2022").buildTransmission("Automatic");
		
		VehicleDirector director = new VehicleDirector(builder);
		Vehicle car = director.buildVehicle();

		VehicleManager manager = VehicleManager.getInstance();
		manager.addVehicle(car);

		List<Vehicle> vehicles = manager.getVehicles();
		for (Vehicle v : vehicles) {
		    System.out.println(car.toString());
		}	}
}
