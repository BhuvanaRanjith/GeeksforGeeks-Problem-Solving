import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the temprature in celcius");
        float tempC=in.nextFloat();
        float tempF=(tempC *9/5)+32;
        System.out.println(tempF);
        //Farenhit to celcius

        float tempCvalue=(tempF-32)*5/9;
        System.out.println(tempCvalue);
    }
}
