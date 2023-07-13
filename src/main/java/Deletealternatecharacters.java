public class Deletealternatecharacters {
    static String delAlternate(String S) {
        // code here
        String s1="";
        for (int i=0;i<S.length();i+=1)
        {
            char ch=S.charAt(i);
            s1=s1+ch;
        }
        System.out.println(s1);
        return s1;

    }
    public static void main(String[] args) {
        delAlternate("GeeksforGeeks");
    }
}
/*Input: S = "Geeks"
        Output: "Ges"
        Explanation: Deleted "e" at index 1
        and "k" at index 3.*/