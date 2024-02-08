
public class Client {

	public static void main(String[] args) {
		VehicleBuilder carBuilder = new CarBuilder();
        VehicleDirector carDirector = new VehicleDirector(carBuilder);
        Vehicle car = carDirector.buildCar(); // Construye un coche con configuraciones específicas

        VehicleBuilder motorcycleBuilder = new MotorcycleBuilder();
        VehicleDirector motorcycleDirector = new VehicleDirector(motorcycleBuilder);
        Vehicle motorcycle = motorcycleDirector.buildMotorcycle(); // Construye una motocicleta con configuraciones específicas

        VehicleManager manager = VehicleManager.getSingleton();
        manager.addVehicle(car);
        manager.addVehicle(motorcycle);

        for (Vehicle vehicle : manager.getVehicles()) {
            vehicle.start();
            }
        }
	}

