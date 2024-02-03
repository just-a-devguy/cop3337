// Parent class
class Vehicle {
    String make;
    String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Method
    void start() {
        System.out.println("Vehicle started.");
    }
}

// Child class overriding the start method
class Car extends Vehicle {
    // Constructor
    public Car(String make, String model) {
        super(make, model); // Call the constructor of the superclass (Vehicle) to initialize make and model
    }

    // Overridden method
    void start() {
        System.out.println("Car started.");
    }
}

public class Main {
    public static void main(String[] args) {
        // instance of vehicle class
        Vehicle myVehicle = new Vehicle("Vehicle", "any");

        // Create an instance of Car
        Car myCar = new Car("Toyota", "Camry");


        // Call the overridden method
        myCar.start(); // Output: Car started.
        myVehicle.start(); // Output: Vehicle started.

        // Access properties of the Vehicle class
        System.out.println("Make: " + myCar.make);
        System.out.println("Model: " + myCar.model);
    }
}
