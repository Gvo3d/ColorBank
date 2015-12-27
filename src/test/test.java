package test;

import main.*;
import org.junit.Test;

/**
 * Created by Gvozd on 27.12.2015.
 */
public class test {

    @Test
    public void CreateColor()
    {
        Color green = new GreenColor();
        Color red = new RedColor();
        Color blue = new BlueColor();
    }

    @Test
    public void CreateRound()
    {
        Round myround = new Round();
        myround.setRadius(5);
        myround.setMyColor(new RedColor());
        System.out.println(myround.getMyName());
        System.out.println(myround.getArea());
        System.out.println(myround.getColorUsage());
        System.out.println(myround.getPrice());
        System.out.println();
    }

    @Test
    public void CreateSquare()
    {
        Square mysquare = new Square();
        mysquare.setSide(5);
        mysquare.setMyColor(new GreenColor());
        System.out.println(mysquare.getMyName());
        System.out.println(mysquare.getArea());
        System.out.println(mysquare.getColorUsage());
        System.out.println(mysquare.getPrice());
        System.out.println();
    }

    @Test
    public void CreateRectangle()
    {
        Rectangle myrec = new Rectangle();
        myrec.setSideA(5);
        myrec.setSideB(8);
        myrec.setMyColor(new BlueColor());
        System.out.println(myrec.getMyName());
        System.out.println(myrec.getArea());
        System.out.println(myrec.getColorUsage());
        System.out.println(myrec.getPrice());
        System.out.println();
    }

    @Test
    public void CreateTriangle()
    {
        Triangle mytri = new Triangle();
        mytri.setSideA(5);
        mytri.setSideB(2);
        mytri.setSideB(3);
        mytri.setMyColor(new GreenColor());
        System.out.println(mytri.getMyName());
        System.out.println(mytri.getArea());
        System.out.println(mytri.getColorUsage());
        System.out.println(mytri.getPrice());
        System.out.println();
    }

    @Test
    public void CreateCollection(){
        GeoList mylist = new GeoList();
        Triangle mytri = new Triangle();
        mytri.setSideA(5);
        mytri.setSideB(2);
        mytri.setSideB(3);
        mytri.setMyColor(new GreenColor());
        mylist.add(mytri);
        System.out.println(mylist.getAllPrice());
        System.out.println(mylist.getAllSquares());
        System.out.println(mylist.getAllVolume());
    }
}
