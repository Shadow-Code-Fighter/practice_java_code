import java.util.ArrayList;

public class ArayList {
    public static void main(String[] args) {
        ArrayList<Integer> x  = new ArrayList<Integer>();
        x.add(10);
        x.add(20);
        System.out.println("add method(): " + x );
        x.add(1,200);
        System.out.println("add(index,value) method(): " + x );

        ArrayList<Integer> y  = new ArrayList<Integer>();
        y.add(30);
        y.add(40);
        x.addAll(2, y);
        System.out.println("addAll(index,collection) method(): "+ x);
    }
}
