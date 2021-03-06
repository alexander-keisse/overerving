package be.intecbrussel.graphics;

public class Rectangle extends Shape {

    // Instance members
    private int height;
    private int width;

    // Class members
    public final static int ANGLES;
    private static int count;

    static {
        ANGLES = 4;
    }

    // This will be executed everytime we make an object
    {
        count++;
    }

    public Rectangle() {
        this(0, 0);
    }

    // Constructors
    public Rectangle(int width, int height) {
        this(width, height, 0, 0);
    }

    public Rectangle(int width, int height, int x, int y) {
        setWidth(width);
        setHeight(height);
        setPosition(x, y);
    }

    // Copy constructor
    public Rectangle(Rectangle r) {
        this(r.getWidth(), r.getHeight(), r.getX(), r.getY());
    }

    // Getters and Setters
    public void setHeight(int height) {
        //TODO: Logic toevoegen om geen negatieve getallen te hebben, indien we negatieve value
        //TODO: gaan we die omzetten in een positief getal
        this.height = (height < 0) ? -height : height;
    }

    public int getHeight() {
        return this.height;
    }

    public void setWidth(int width) {
        this.width = Math.abs(width);
    }

    public int getWidth() {
        return this.width;
    }

    public static int getCount() {
        return count;
    }

    // Own methods added
    public void grow(int d) {
        this.width = Math.abs(width * d);
        this.height = Math.abs(height * d);
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

}
