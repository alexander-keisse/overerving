package be.intecbrussel.graphics;

public class IsoScelesTriangle extends Triangle {

    private static int count = 0;

    {
        count++;
    }

    public IsoScelesTriangle() {
        this(0, 0, 0, 0, 0);
    }

    public IsoScelesTriangle(int height, int width) {
        this(height, width, 0, 0, 0);
    }

    public IsoScelesTriangle(int height, int width, int perpendicular, int x, int y) {
        super(height, width, perpendicular, x, y);
    }

    public IsoScelesTriangle(Triangle triangle) {
        super(triangle);
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void setHeight(int height) {
        setPerpendicular(height);
        super.setHeight(height);
    }
}
