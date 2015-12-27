package main;

/**
 * Created by Gvozd on 27.12.2015.
 */
public abstract class Geometry {
    String myName;
    Color myColor;

    abstract public float getArea();

    public float getColorUsage(){
    float result = getArea()*myColor.getUsageRate();
        return result;
    }

    public float getPrice(){
        return getColorUsage()*(float)myColor.getPrice();
    }

    public Color getMyColor() {
        return myColor;
    }

    public void setMyColor(Color myColor) {
        this.myColor = myColor;
    }

    public String getMyName() {
        return myName;
    }

}
