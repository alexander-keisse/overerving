package be.intecbrussel;

public class Car {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    public void slowDown() {
        System.out.println("Car is slowing down");
    }

    public void turnLeft() {
        System.out.println("Car is turning left");
    }

    public void turnRight() {
        System.out.println("Car is turning right");
    }
}
