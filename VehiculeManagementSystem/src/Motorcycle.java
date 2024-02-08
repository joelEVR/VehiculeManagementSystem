
public class Motorcycle implements Vehicle {

	    private String engine;
	    private int wheels;
	    private String color;
	    private String handlebarType; // Atributo específico de Motorcycle

	    // Constructor de Motorcycle incluyendo el nuevo atributo
	    public Motorcycle(String engine, int wheels, String color, String handlebarType) {
	        this.engine = engine;
	        this.wheels = wheels;
	        this.color = color;
	        this.handlebarType = handlebarType;
	    }

	    @Override
	    public void start() {
	        System.out.println("Motorcycle with engine " + engine + ", " + wheels + " wheels, " + color + " color, and " 
	        + handlebarType + " handlebar is starting.");
	    }

	    @Override
	    public void stop() {
	        System.out.println("Motorcycle is stopping.");
	        }
	    }
