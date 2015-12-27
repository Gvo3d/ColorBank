package main;

/**
 * Created by Gvozd on 27.12.2015.
 */
public class App {
    public static void main(String[] args) {
        Round ro = new Round();
        ro.setRadius(10);
        ro.setMyColor(new GreenColor());

        Triangle tr = new Triangle();
        tr.setSideA(4);
        tr.setSideB(7);
        tr.setSideC(2);
        tr.setMyColor(new BlueColor());

        Square sq = new Square();
        sq.setSide(8);
        sq.setMyColor(new RedColor());

        Rectangle re = new Rectangle();
        re.setSideA(3);
        re.setSideB(9);
        re.setMyColor(new GreenColor());


        GeoList mylist = new GeoList();
        mylist.add(ro);
        mylist.add(tr);
        mylist.add(sq);
        mylist.add(re);

        System.out.println("Full price is "+mylist.getAllPrice()+" dollars.");
        System.out.println("Full area is "+mylist.getAllSquares()+" m.");
        System.out.println("Full paint literage is "+mylist.getAllVolume()+" liters.");
    }

}
