public class SplitString {
    public static void main(String args[])
    {
        String s="APS Microtech Pvt ltd";
        String s1[]=s.split("\\s");

        for(String s2:s1)
        {
            System.out.println(s2);
        }
    }
}
