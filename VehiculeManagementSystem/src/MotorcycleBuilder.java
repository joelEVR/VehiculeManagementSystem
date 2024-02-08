
public class MotorcycleBuilder implements VehicleBuilder {
    
	private String engine;
    private int wheels;
    private String color;
    private String handlebarType;

    @Override
    public MotorcycleBuilder buildEngine(String engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public MotorcycleBuilder buildWheels(int numberOfWheels) {
        this.wheels = numberOfWheels;
        return this;
    }

    @Override
    public MotorcycleBuilder buildColor(String color) {
        this.color = color;
        return this;
    }

    public MotorcycleBuilder buildHandlebarType(String handlebarType) {
        this.handlebarType = handlebarType; // Método específico para Motorcycle
        return this;
    }

    @Override
    public Vehicle finish() {
        return new Motorcycle(engine, wheels, color, handlebarType);
        }
    }
