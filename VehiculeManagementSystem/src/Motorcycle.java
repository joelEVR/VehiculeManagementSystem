
public class Motorcycle implements Vehicle {

	private String engine;
	private int wheels;
	private String color;
	private String handlebarType;

	public Motorcycle() {
		// TODO Auto-generated constructor stub
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setHandlebarType(String handlebarType) {
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
