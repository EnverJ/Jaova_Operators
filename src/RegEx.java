import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {

        Pattern pattern= Pattern.compile("java", Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher("Learn Java");

        boolean matchFound=matcher.find();
        if(matchFound)
        {
            System.out.println("Match Found");
        } else {
            System.out.println("Match No found");
        }
    }
}
