package be.intecbrussel;

public class App {

    public static void main(String[] args) {

        Car car = new Car();
        car.setColor("White");
        System.out.println("Car color is: " + car.getColor());

        car.accelerate();
        car.turnLeft();
        car.turnRight();
        car.slowDown();
        System.out.println();

        Convertible convertible = new Convertible();
        convertible.setColor("Black");
        System.out.println("Convertible color is: " + convertible.getColor());

        convertible.accelerate();
        convertible.turnLeft();
        convertible.turnRight();
        convertible.slowDown();
        convertible.switchToNoRoof();
        System.out.println();

        ElectricalCar electricalCar = new ElectricalCar();
        electricalCar.setColor("Red");

        electricalCar.accelerate();
        electricalCar.turnLeft();
        electricalCar.turnRight();
        electricalCar.slowDown();


    }

}
