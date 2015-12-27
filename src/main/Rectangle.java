package main;

/**
 * Created by Gvozd on 27.12.2015.
 */
public class Rectangle extends Geometry {
    private float sideB = 1;
    private float sideA = 1;

    public Rectangle() {
        myName = "Rectangle";
    }

    public float getSideB() {
        return sideB;
    }

    public float getSideA() {
        return sideA;
    }

    public void setSideA(float side) {
        this.sideA = side;
    }

    public void setSideB(float side) {
        this.sideB = side;
    }

    @Override
    public float getArea() {
        return ((float)sideA * sideB);
    }
}
