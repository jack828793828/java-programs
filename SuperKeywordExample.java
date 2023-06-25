class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    private int year;

    public Car(String brand, int year) {
        super(brand);
        this.year = year;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Year: " + year);
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022);
        car.displayInfo();
    }
}

