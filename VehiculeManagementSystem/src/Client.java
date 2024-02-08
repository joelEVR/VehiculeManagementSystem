
public class Client {

	public static void main(String[] args) {
		// Obtener la instancia Singleton de VehicleManager
		VehicleManager manager1 = VehicleManager.getSingleton();
		VehicleManager manager2 = VehicleManager.getSingleton();

		// Demostración de que manager1 y manager2 son la misma instancia
		System.out.println("Manager1 y Manager2 son la misma instancia: " + (manager1 == manager2));

		// Crear vehículos usando Builders
		Vehicle car = new CarBuilder().buildEngine("V6").buildWheels(4).buildColor("Blue").finish();
		Vehicle motorcycle = new MotorcycleBuilder().buildEngine("250cc").buildWheels(2).buildColor("Red").finish();

		// Añadir vehículos al VehicleManager
		manager1.addVehicle(car);
		manager1.addVehicle(motorcycle);

		// Recuperar y mostrar vehículos gestionados
		System.out.println("Vehículos gestionados: " + manager1.getVehicles().size());
	}

}
