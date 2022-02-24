package be.intecbrussel.graphics;

public class SquareApp {

    public static void main(String[] args) {

        Square square = new Square();

        square.setSide(-55);
        square.setPosition(14, 28);

        printSquare(square);

        Square square2 = new Square(37);
        printSquare(square2);

        Square square3 = new Square(17, 84, 36);
        printSquare(square3);

        Square square4 = new Square(square);
        printSquare(square4);

        Rectangle rectangle1 = new Rectangle(14, 55);
        Rectangle rectangle2 = new Rectangle(97, 57, 52, 63);

        System.out.println("Square objects created: " + Square.getCount());
        System.out.println("Rectangle objects created: " + Rectangle.getCount());
    }

    private static void printSquare(Square square) {
        System.out.println("Total area is: " + square.getArea());
        System.out.println("Total perimeter is: " + square.getPerimeter());

        System.out.println("Height is: " + square.getHeight());
        System.out.println("Width is: " + square.getWidth());

        System.out.printf("Position is (%d, %d)", square.getX(), square.getY());
        System.out.println();
        System.out.println();
    }

}
