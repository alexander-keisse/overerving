package be.intecbrussel.graphics;

public class Triangle extends Shape {

    public static final int ANGLES = 3;
    private static int count = 0;

    private int height;
    private int width;
    private int perpendicular;

    public Triangle() {
        this(0, 0, 0, 0, 0);
    }

    public Triangle(int height, int width, int perpendicular) {
        this(height, width, perpendicular, 0, 0);
    }

    public Triangle(int height, int width, int perpendicular, int x, int y) {
        super(x, y);
        setHeight(height);
        setWidth(width);
        setPerpendicular(perpendicular);
    }

    public Triangle(Triangle triangle) {
        this(triangle.getHeight(), triangle.getWidth(), triangle.getPerpendicular(),
                triangle.getX(), triangle.getY());
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = Math.abs(height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = Math.abs(width);
    }

    public int getPerpendicular() {
        return perpendicular;
    }

    public void setPerpendicular(int perpendicular) {
        this.perpendicular = Math.abs(perpendicular);
    }

    public static int getCount() {
        return count;
    }

    @Override
    public double getArea() {
        return (width * height) / 2;
    }

    @Override
    public double getPerimeter() {
        return width + Math.hypot(height, perpendicular) + Math.hypot(height, (width - perpendicular));
    }
}
