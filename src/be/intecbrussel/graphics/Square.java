package be.intecbrussel.graphics;

public class Square extends Rectangle {

    private static int count = 0;

    {
        count++;
    }

    public Square() {
        this(0, 0, 0);
    }

    public Square(int side) {
        this(side, 0, 0);
    }

    public Square(int side, int x, int y) {
        super(side, side, x, y);
    }

    public Square(Square square) {
//        this(square.getHeight(), square.getX(), square.getY());
        super(square);
    }

    public int getSide() {
        return getHeight();
    }

    public void setSide(int side) {
        super.setHeight(side);
        super.setWidth(side);
    }


    public static int getCount() {
        return count;
    }

    @Override
    public void setHeight(int height) {
        setSide(height);
    }

    @Override
    public void setWidth(int width) {
        setSide(width);
    }
}
