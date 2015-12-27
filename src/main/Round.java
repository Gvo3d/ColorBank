package main;

/**
 * Created by Gvozd on 27.12.2015.
 */
public class Round extends Geometry {
    private float radius;

    public Round() {
        myName = "Round";
        radius = 1;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (3.14159f * radius * radius);
    }
}
