import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.PI;

public class JavaSwitchCase {
    public static void main(String[] args) {
        List<Double> ar=new ArrayList<Double>();
        double a=5;
        double l=20;
        double b=10;
        ar.add(a);
        ar.add(l);
        ar.add(b);
        switchCase(2,ar);

    }
    static double switchCase(int choice, List<Double> arr){
        // code here
        switch (choice) {
            case 1:
                double pi=3.141592;
                double area=pi* arr.get(0)* arr.get(0);
                System.out.println(area);
                return area;
            case 2:
                double rect=(arr.get(1)*arr.get(2));
                System.out.println(rect);
                return rect;

        }
        return -1;
    }
}
