package domain;

public class Car {
    private String name;
    private Double price;

    public Car(String name, Double price) {

        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
