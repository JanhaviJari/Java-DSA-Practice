import java.util.Arrays;

public class Anagram_UsingFunction {
    public static void main(String[] args)
    {
        String s1="silent";
        String s2="listen";

        if(s1.length()!= s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        char[] a= s1.toCharArray();
        char[] b=s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b))
        {
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not");
        }
    }
}
