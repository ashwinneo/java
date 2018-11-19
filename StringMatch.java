import java.util.regex.Matcher;
import java.util.regex.Pattern;

class StringMatch{

    static boolean checkString(String s1) {
        String regex = ".*[0-9].*";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s1);

        while(m.find()) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        if(StringMatch.checkString("ashwin")){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}