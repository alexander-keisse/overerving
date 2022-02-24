package be.intecbrussel.graphics;

public abstract class Shape {

    private int x;
    private int y;

    private static int count;

    {
        count++;
    }

    public Shape() {
        this(0, 0);
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static int getCount() {
        return count;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
