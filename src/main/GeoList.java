package main;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gvozd on 27.12.2015.
 */
public class GeoList {
    private List<Geometry> data = new ArrayList();

    public void add(Geometry geometry){
        data.add(geometry);
    }

    public void remove(int id){
        data.remove(id);
    }

    public String toString(){
        String result="";
        for (Geometry geo:data){
            result=result+" "+geo.getMyName();
        }
        return result;
    }

    public float getAllPrice(){
        float result=0f;
        int per;
        for (Geometry geo:data){
            result=result+geo.getPrice();
        }

        result = result*100;
        per=(int)result;
        result = per;
        result=result/100;

        return result;
    }

    public int getAllVolume(){
        float result = 0;
        int res;
        for (Geometry geo:data){
            result=result+geo.getColorUsage();
        }
        res = (int)result;
        return res;
    }

    public float getAllSquares(){
        float result = 0f;
        for (Geometry geo:data){
            result=result+geo.getArea();
        }
        return result;
    }
}
