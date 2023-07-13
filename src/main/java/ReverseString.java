public class ReverseString {
    public static void main(String[] args) {
        rtnString("Viewerskithcen");

    }
    static String rtnString(String S)
    {
        String nstr="";
        for(int i=S.length()-1;i>=0;i--)
        {
            nstr=nstr+S.charAt(i);
        }
        System.out.println(nstr);
        return nstr;
    }
}
