import java.util.*;
class RemoveDuplicatesFromString{

    static void removeDuplicates(String s) {
        HashSet<Character> h = new HashSet<Character>();
        for(int i=0; i<s.length(); i++) {
            h.add(s.charAt(i));
        }
        //System.out.println(h);
        String c = "";
        for(int i=0; i<s.length();i++) {
            if(c.indexOf(s.charAt(i)) < 0) {
                c += s.charAt(i);
            }
        }
        System.out.println(c);
    }

    static void removeDuplicate(String s) {
        char[] c = s.toCharArray();

        int k = 1;
        int i = 1;

        while(i < c.length) {
            if(c[i] != c[i-1]) {
                c[k] = c[i];
                k++;
            }
            i++;
        }
        System.out.println(Arrays.toString(c));
        s = new String(c); 
        System.out.println(s.substring(0,k)); 
    }

    public static void main(String[] args) {
        removeDuplicate("geeksforgeeks");
    }
}