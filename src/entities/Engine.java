package entities;

public class Engine implements MotorcyclePart {
    private String name;
    private double price;

    public Engine(String name, double price) {
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
