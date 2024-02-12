package vehicle;

// Defines a common interface for all vehicles, ensuring they can be started and stopped.
public interface Vehicle {
    void start(); // Method to start the vehicle. Implementations should define how the vehicle starts.
    void stop();  // Method to stop the vehicle. Implementations should define how the vehicle stops.
}
