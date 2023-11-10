package entities;

public class Tire implements MotorcyclePart {
    private String name;
    private double price;

    public Tire(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
