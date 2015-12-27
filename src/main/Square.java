package main;

/**
 * Created by Gvozd on 27.12.2015.
 */
public class Square extends Geometry {
    private float side = 1;

    public Square() {
        myName = "Square";
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public float getArea() {
        return (side * side);
    }
}
