import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter a=");
        int a=in.nextInt();
        System.out.println("Enter B");
        int b=in.nextInt();
        System.out.println("Enter C=");
        int c=in.nextInt();
        int max=a;
//        if(b>max)
//        {
//            max=b;
//        }
//        if(c>max)
//        {
//            max=c;
//        }
        max=Math.max(c,Math.max(a,b));
        System.out.println(max);
    }

}
