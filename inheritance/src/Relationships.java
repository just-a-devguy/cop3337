// Base class representing a Vehicle
class Vehicles {
    // Common properties and behaviors of all vehicles
    String type;

    Vehicles(String type) {
        this.type = type;
    }

    void start() {
        System.out.println(type + " is starting");
    }

    void stop() {
        System.out.println(type + " is stopping");
    }
}

// Derived class representing a Car (is-a relationship with Vehicles)
class Cars extends Vehicles {
    // Car-specific properties
    String model;

    // Cars has-a Engine (composition)
    Engine engine;

    Cars(String model, String type) {
        super(type); // superclass constructor
        this.model = model;
        this.engine = new Engine(); // Create an Engine for the Car
    }

    void drive() {
        System.out.println(model + " is driving");
    }
}

// Class representing an Engine (part of Car via composition)
class Engine {
    void run() {
        System.out.println("Engine is running");
    }
}

// Main class to test the Vehicle, Car, and Engine classes
public class Relationships {
    public static void main(String[] args) {
        // Create a Car
        Cars car = new Cars("Toyota", "Car");

        // Start the Car
        car.start(); // Output: Car is starting

        // Start the Engine of the Car
        car.engine.run(); // Output: Engine is running

        // Drive the Car
        car.drive(); // Output: Toyota is driving

        // Stop the Car
        car.stop(); // Output: Car is stopping
    }
}
