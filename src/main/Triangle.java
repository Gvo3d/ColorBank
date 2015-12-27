package main;

/**
 * Created by Gvozd on 27.12.2015.
 */
public class Triangle extends Geometry {
    private float sideB = 1;
    private float sideA = 1;
    private float sideC = 1;

    public Triangle() {
        myName = "Triangle";
    }

    public float getSideB() {
        return sideB;
    }

    public void setSideB(float sideB) {
        this.sideB = sideB;
    }

    public float getSideA() {
        return sideA;
    }

    public void setSideA(float sideA) {
        this.sideA = sideA;
    }

    public float getSideC() {
        return sideC;
    }

    public void setSideC(float sideC) {
        this.sideC = sideC;
    }

    @Override
    public float getArea() {
        float a = sideA;
        float b = sideB;
        float c = sideC;
        float result, p,r;
        p=a+b+c/2;
        r=(float)Math.sqrt(p-a)*(p-b)*(p-c)/p;
        result = 0.5f*r*(a+b+c);
        return result;
    }
}
