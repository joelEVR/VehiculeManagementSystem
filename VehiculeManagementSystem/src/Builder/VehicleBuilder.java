package Builder;
import Vehicle.Vehicle;

public interface VehicleBuilder {

	public void buildName(String name);
	
	public void buildEngine(String engine);

	public void buildWheels(int numberOfWheels);

	public void buildColor(String color);
	
	public void buildModel(String model);
	
	public void buildTransmission(String transmission);
	
	Vehicle build();



}
