package demo.day04;

public class Car {
    private String color;
    private String model;

    public Car() {
        this.color="红色";
        this.model = "轿车";
    }

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
