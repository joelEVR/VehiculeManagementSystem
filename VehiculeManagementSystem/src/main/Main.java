package main;

import builder.VehicleBuilder;
import builder.VehicleDirector;
import factory.VehicleFactory;
import singleton.VehicleManager;
import vehicle.Vehicle;

/**
 * Demonstrates the use of Singleton, Builder, and Factory patterns to manage
 * and construct vehicles.
 */
public class Main {
	public static void main(String[] args) {
		// Initialize VehicleDirector and VehicleManager (Singleton)
		VehicleDirector director = new VehicleDirector();
		VehicleManager manager = VehicleManager.getInstance();

		// Use VehicleFactory to get CarBuilder, set properties, build, and add to
		// manager
		VehicleBuilder carBuilder1 = VehicleFactory.getVehicleBuilder("car")
				.buildEngine("V8")
				.buildWheels(4)
				.buildColor("Blue")
				.buildName("Mustang")
				.buildModel("2025")
				.buildTransmission("Manual");
		director.setBuilder(carBuilder1);
		Vehicle car1 = director.buildVehicle();
		manager.addVehicle(car1);

		// Repeat the process for another car and a motorcycle
		VehicleBuilder carBuilder2 = VehicleFactory.getVehicleBuilder("car")
				.buildEngine("V6")
				.buildWheels(4)
				.buildColor("Red")
				.buildName("Camaro")
				.buildModel("2024")
				.buildTransmission("Automatic");
		director.setBuilder(carBuilder2);
		Vehicle car2 = director.buildVehicle();
		manager.addVehicle(car2);

		VehicleBuilder motorcycleBuilder = VehicleFactory.getVehicleBuilder("motorcycle")
				.buildEngine("600cc")
				.buildWheels(2)
				.buildColor("Green")
				.buildName("Ninja")
				.buildModel("2023")
				.buildTransmission("Manual");
		director.setBuilder(motorcycleBuilder);
		Vehicle motorcycle = director.buildVehicle();
		manager.addVehicle(motorcycle);

		// Print all vehicles managed by VehicleManager
		manager.getVehicles().forEach(System.out::println);
	}
}

////Implementation with flow simplification
//director.setBuilder(VehicleFactory.getVehicleBuilder("motorcycle")
//	    .buildEngine("600cc")
//	    .buildWheels(2)
//	    .buildColor("Green")
//	    .buildName("Ninja")
//	    .buildModel("2023")
//	    .buildTransmission("Manual"));
//
//	// Construir el vehículo utilizando el director y añadirlo al gestor de vehículos
//	Vehicle motorcycle = director.buildVehicle();
	
	
	
/*
 * //Testing Singleton VehicleManager manager1 = VehicleManager.getInstance();
 * VehicleManager manager2 = VehicleManager.getInstance();
 * 
 * Vehicle car4 = new Car("Tesla", "Model S", "White", "Electric", 4,
 * "Automatic"); Vehicle car5 = new Car("BMW", "X5", "Black", "V6", 4,
 * "Manual"); Vehicle motorcycle1 = new Motorcycle("Harley-Davidson",
 * "Sportster", "Red", "1200cc", 2, "Manual");
 * 
 * // Add vehicles to the VehicleManager manager.addVehicle(car4);
 * manager.addVehicle(car5); manager.addVehicle(motorcycle1);
 * 
 * // Retrieve vehicles from the VehicleManager and print them
 * System.out.println("Vehicles in the VehicleManager:"); for (Vehicle vehicle :
 * manager.getVehicles()) { System.out.println(vehicle); } // Verificar si ambas
 * instancias son iguales System.out.println("¿Son las dos instancias iguales? "
 * + (manager == manager1 && manager1 == manager2));
 */
