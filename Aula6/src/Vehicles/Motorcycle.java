package Vehicles;

public class Motorcycle extends Vehicle{
    private int wheels;

    public Motorcycle() {
        super();
        this.wheels = 0;
    }

    public Motorcycle(int year, String brand, String model, float price, String color, int wheels) {
        super(year, brand, model, price, color);
        this.wheels = wheels;
    }

    @Override
    public String toString(){
        return super.toString() + " Wheels: " + this.wheels;
    }
    @Override
    public void drive(){
        System.out.println("Driving Vehicles.Motorcycle");
    };
}
