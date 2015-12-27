package main;

/**
 * Created by Gvozd on 27.12.2015.
 */
public abstract class Color {
    int colornumber;
    String colorName;
    float usageRate;
    int priceFor1Liter;

    public String getName(){
        return colorName;
    }

    public float getUsageRate() {
        return usageRate;
    }

    public int getPrice(){
        return priceFor1Liter;
    }
}
