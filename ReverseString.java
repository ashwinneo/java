import java.util.Arrays;

class ReverseString{

    static String reverseIterative(String s) {
        String s1 = "";
        char[] c1 = s.toCharArray();
        System.out.println(Arrays.toString(c1));
        for(int i=c1.length-1; i>=0; i--) {
            s1 += c1[i];
        }
        return s1;
    }
    
    static void reverseRecursive(String s) {
        if(s.length() == 1) {
            System.out.println(s);
        } else {
            System.out.print(s.charAt(s.length()-1));
            reverseRecursive(s.substring(0,s.length()-1));
        }
    }

    public static void main(String[] args) {
        String s = "Ashwin";
        //String s2 = ReverseString.reverse(s);
        reverseRecursive(s);
        //System.out.println(s2);
    }
}