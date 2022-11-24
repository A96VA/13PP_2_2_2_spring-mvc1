package web.models;

public class Car {
    public String gosNomer;
    private String brand;
    private String color;

    public Car(String gosNomer, String brand, String color) {
        this.gosNomer = gosNomer;
        this.brand = brand;
        this.color = color;
    }

    public Car() {
    }

    public String getGosNomer() {
        return gosNomer;
    }

    public void setGosNomer(String gosNomer) {
        this.gosNomer = gosNomer;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "gosNomer=" + gosNomer +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
