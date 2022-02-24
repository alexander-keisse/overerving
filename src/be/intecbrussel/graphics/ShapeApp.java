package be.intecbrussel.graphics;

public class ShapeApp {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(21, 87, 96, 37);
        Circle circle = new Circle(74, 36, 54);
        Triangle triangle = new Triangle(89, 41, 33,68, 78);
        IsoScelesTriangle isoScelesTriangle = new IsoScelesTriangle(27, 63, 87, 66, 14);

        System.out.println(rectangle.getArea());
        System.out.println(circle.getArea());


    }



}
