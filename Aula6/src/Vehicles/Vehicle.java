package Vehicles;

abstract class Vehicle {
    private int year;
    private String brand;
    private String model;
    private float price;
    private String color;

    public Vehicle(){
        this.year = 0;
        this.brand = "";
        this.model = "";
        this.price = 0;
        this.color = "";
    }

    public Vehicle(int year, String brand, String model, float price, String color){
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void drive();
    @Override
    public String toString() {
        return  "year: " + year +
                ", brand: " + brand + '\'' +
                ", model: " + model + '\'' +
                ", price: " + price + '\'' +
                ", color: " + color ;
    }
}
