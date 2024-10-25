package oop.practice.model;

public class Car {
    private String model;
    private String manufacturer;
    private int year;
    private float engineCapacity;

    public Car(String model, String manufacturer, int year, float engineCapacity) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

    public void print() {
        System.out.println("\nModel: " + model);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Year: " + year);
        System.out.println("Engine Capacity: " + engineCapacity);
    }

    public void print(float currentFuel) {
        if (currentFuel > engineCapacity) {
            System.out.println("\nCurrent fuel cannot be greater than engine capacity!");
            return;
        }
        System.out.println("\nModel: " + model);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Year: " + year);
        System.out.println("Engine Capacity: " + engineCapacity);
        System.out.println("Current fuel amount: " + currentFuel);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
