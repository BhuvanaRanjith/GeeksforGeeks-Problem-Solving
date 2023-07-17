public class PrimeNumber {
    public static void main(String[] args) {
        Prime(12);
    }

    static void Prime(int n) {
        int i = 2;
        boolean flag=true;
        while (i<n)
        {
            if(n%i==0)
                System.out.println("Not prime;");
            flag=false;
            i=i+1;
        }
        if(flag=true)
            System.out.println("prime");
        

    }


}