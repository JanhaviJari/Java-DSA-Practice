import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp1 {
    public static void main(String args[]){
        int count=0;
        Pattern p=Pattern.compile("[^abc]");
        Matcher m=p.matcher("a7qBc6");
        while(m.find())
        {
            System.out.println(m.start()+".."+m.group());
        }
    }
}
