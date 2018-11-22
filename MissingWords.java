import java.util.ArrayList;

public class MissingWords {
    public static void main(String args[]) {
        try {
            String  s1  = "I love programing I Programing";
            String  s2 =  "Programing I";
            String arr1[] = s1.split(" ");
            String arr2[] = s2.split(" ");
            ArrayList<String> tmp1 = new ArrayList<String>();
            ArrayList<String> tmp2 = new ArrayList<String>();

            for (int i = 0,j=0; i < arr1.length; i++) {
                if (arr1[i].equalsIgnoreCase(arr2[j])) {
                    tmp1.add(arr1[i]);
                    j++;
                } else {
                    tmp2.add(arr1[i]);
                }
            }
            System.err.println(tmp2);

        } catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}