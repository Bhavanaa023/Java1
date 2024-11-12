package pkg1;
class Vehicle {
    private String brand;
    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void honk() {
        System.out.println("Honking...");
    }
}

// Parent interface 1
interface Electric {
    void charge();
}

// Parent interface 2
interface Autonomous {
    void autoDrive();
}

// Child class inheriting and implementing parents
class ElectricCar extends Vehicle implements Electric, Autonomous {
    public ElectricCar(String brand) {
        super(brand);
    }

    @Override
    public void charge() {
        System.out.println("Charging...");
    }

    @Override
    public void autoDrive() {
        System.out.println("Driving autonomously...");
    }

    public void displayDetails() {
        System.out.println("Brand: " + getBrand());
    }
}

public class B42 {
    public static void main(String[] args) {
        // Create an object of ElectricCar
        ElectricCar car = new ElectricCar("Tesla");

        // Call methods
        car.honk();
        car.charge();
        car.autoDrive();
        car.displayDetails();
    }
}
